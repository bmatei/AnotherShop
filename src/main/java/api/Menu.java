package api;

import java.util.NoSuchElementException;
import java.util.Scanner;

public abstract class Menu {
    public static class Quit extends Menu {
        public Quit(){super(null, null);}
        public void drawCustomOptions(){
            System.out.println("Exiting application. Bye.");
        }
        public Menu processCustomInput(String input) {return null;}
    }

    public static Scanner user = new Scanner(System.in);

    protected Menu previous;
    protected ShopAPI shop;

    protected Menu(ShopAPI shop) {
        this(new Menu.Quit(), shop);
    }
    protected Menu(Menu previous, ShopAPI shop) {
        this.previous = previous;
        this.shop = shop;
    }

    protected abstract void drawCustomOptions();
    protected abstract Menu processCustomInput(String input);

    public final Menu getNextMenu() {
        String input = null;
        try {
            input = user.nextLine();
        } catch (NoSuchElementException e) {
            return new Menu.Quit();
        }
        if(input.equals("p")) {
            return previous;
        }
        if(input.equals("q")) {
            return new Menu.Quit();
        }
        return processCustomInput(input);
    }

    public final void draw() {
        drawCustomOptions();
        System.out.println("p -- Previous Menu");
        System.out.println("q -- Quit");
        System.out.print("\n>");
    }
}