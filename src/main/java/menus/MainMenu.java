package menus;

import api.Menu;
import api.ShopAPI;

public class MainMenu extends Menu {
    public MainMenu(ShopAPI api) {super(api);}
    public MainMenu(Menu previous, ShopAPI shop) {super(previous, shop);}
    public void drawCustomOptions(){
        System.out.println("1 -- Action");
        System.out.println("2 -- Next Menu");
        System.out.println("3 -- Login Menu");
    }
    public Menu processCustomInput(String input) {
        if(input.equals("1")) {
            System.out.println("Performed action 1");
            return this;
        } else if(input.equals("2")) {
            return new Menu2(this, shop);
        } else if(input.equals("3")) {
            return new LoginMenu(this, shop);
        } else {
            System.out.println("Unknown option");
        }
        return this;
    }
}