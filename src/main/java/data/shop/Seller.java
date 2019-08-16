package data.shop;

import data.common.User;
import java.util.ArrayList;

public class Seller extends User {
    private String description;
    private ArrayList<Product> products;

    public ArrayList<Product> getProducts() {
        return products;
    }
}