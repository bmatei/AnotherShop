package menus;

import api.Menu;
import api.ShopAPI;
import data.shop.Customer;



public class CustomerMenu extends Menu {

    private Customer customer;

    public CustomerMenu(Menu previous, ShopAPI shop, Customer customer) {
        super(previous, shop);
        this.customer = customer;
    }
    public void drawCustomOptions(){
        System.out.println("1 -- view history of purchases");
        System.out.println("2 -- view cart menu");
    }
    public Menu processCustomInput(String input) {
        if(input.equals("1")) {
            System.out.println(customer.getHistory().getData());
            return this;
        } else if(input.equals("2")) {
            return new CartMenu();
        } else {
            System.out.println("Unknown option");
        }
        return this;
    }


}
