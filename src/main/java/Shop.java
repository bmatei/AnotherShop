import api.Menu;
import api.ShopAPI;
import data.Database;
import data.financial.Purchase;
import data.shop.Customer;
import menus.MainMenu;

public class Shop implements ShopAPI {
    private Database data;
    private Menu screen;

    public Shop() {
        data = new Database();
        screen = new MainMenu(this);
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