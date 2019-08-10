package menus;

import api.Menu;
import api.ShopAPI;

public class Menu2 extends Menu {
    public Menu2(ShopAPI api) {super(api);}
    public Menu2(Menu previous, ShopAPI shop) {super(previous, shop);}
    public void drawCustomOptions(){
        System.out.println("1 -- Action");
    }
    public Menu processCustomInput(String input) {
        String line = input;
        if(line.equals("1")) {
            System.out.println("Performed action 2");
        } else {
            System.out.println("Unknown option");
        }
        return this;
    }
}
