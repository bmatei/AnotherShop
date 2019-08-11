import api.Menu;
import api.ShopAPI;
import data.Database;
import data.financial.Purchase;
import data.shop.Customer;
import menus.CustomerMenu;
import menus.MainMenu;
import menus.Menu2;

public class Shop implements ShopAPI {
    private Database data;
    private Menu screen;


    public Shop() {
        data = new Database();
        //screen = new MainMenu(this);
        screen = new CustomerMenu( new Menu.Quit(),this, new Customer());
    }
    public void makeTransaction(Customer customer, Purchase purchase){}
    public void run(){
        do {
            screen.draw();
            screen = screen.getNextMenu();

        } while(screen instanceof Menu.Quit == false);
    }

    public static void main(String[] args) {
        Shop s = new Shop();
        s.run();
    }
}