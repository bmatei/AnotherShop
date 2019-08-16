package api;

import data.common.User;
import data.financial.Purchase;
import data.shop.Customer;
import data.shop.Seller;

import java.util.ArrayList;

public interface ShopAPI {
    public void makeTransaction(Customer customer, Purchase purchase);

    public void addSeller(Seller seller);
    public void addCustomer(Customer customer);

    public Seller matchSeller();
    public Customer matchCustomer();

}
