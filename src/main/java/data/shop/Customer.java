package data.shop;

import data.common.User;
import data.financial.History;
import data.financial.Purchase;

import java.util.ArrayList;

public class Customer extends User {
    private Cart cart;
    private History history;

    public Customer(){
        cart = new Cart();
        history = new History();

    }

    public Customer(Cart cart, History history) {
        this.cart = cart;
        this.history = history;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }
}