package menus;

import api.Menu;
import api.ShopAPI;
import data.shop.Seller;

public class SellerMenu extends Menu {
    private Seller seller;

    public SellerMenu(ShopAPI shop) { super(shop); }

    public SellerMenu(Menu previous, ShopAPI shop, Seller seller) {
        super(previous, shop);
        this.seller = seller;
    }

    protected void drawCustomOptions() {
        System.out.println("1 -- See sellers products");
        System.out.println("2 -- Search for product");
    }

    protected Menu processCustomInput(String input) {
        if(input.equals("1")) {
            System.out.println(seller.getProducts());
            // need to write @Override for listing: ArrayList<Product> products of this seller
            return this;
        } else if(input.equals("2")) {
            // go to Product Menu
            return new ProductMenu();
        } else {
            System.out.println("Unknown option");
        }
        // return to Seller Menu
        return this;
    }
}
