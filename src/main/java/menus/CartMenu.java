package menus;

import api.Menu;

public class CartMenu extends Menu {

    protected void drawCustomOptions() { }
    protected Menu processCustomInput(String input) { return null; }
    public CartMenu(){super(null, null);}


}

























/*
public static class Quit extends Menu {
    public Quit(){super(null, null);}
    public void drawCustomOptions(){
        System.out.println("Exiting application. Bye.");
    }
    public Menu processCustomInput(String input) {return null;}
}*/