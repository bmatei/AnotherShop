package api;

import data.financial.Purchase;
import data.shop.Customer;

public interface ShopAPI {
    public void makeTransaction(Customer customer, Purchase purchase);
}
