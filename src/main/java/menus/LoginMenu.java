package menus;

import api.Menu;
import api.ShopAPI;
import data.common.AuthenticationData;
import data.shop.Customer;
import data.shop.Seller;

public class LoginMenu extends Menu {
    private String userName;
    private String password;

    protected LoginMenu(ShopAPI shop) {
        super(shop);
    }

    public LoginMenu(Menu previous, ShopAPI shop) {
        super(previous, shop);
    }

    // printing out Login Menu options
    protected void drawCustomOptions() {
        System.out.println("1 -- Login as Customer");
        System.out.println("2 -- Create new Customer account");
        System.out.println("3 -- Login as Seller");
        System.out.println("4 -- Create new Seller account");
    }

    protected Menu processCustomInput(String input) {
            // case 1 --> login as Customer
        if (input.equals("1")) {
            inputUsername();
            // check if user exists in database
            if (userName.equals(shop.matchCustomer().getName())) {
                inputPassword();
                // check if password is correct
                if (password.equals(shop.matchCustomer().getData().getPassword())) {
                    // forward to Customer Menu assigned to this Customer
                    return new CustomerMenu(this, shop, shop.matchCustomer());
                } else {
                    System.out.println("Wrong password");
                    // return to Login Menu
                    return this;
                }
            } else {
                System.out.println("Unknown user");
                // return to Login Menu
                return this;
            }

            // case 2 --> creating new Customer
        } else if (input.equals("2")) {
            System.out.println("New customer");
            // setting username and password
            inputUsername();
            inputPassword();
            //create new customer, assigning username and password to new customer
            //and add to the database
            shop.addCustomer(createCustomer());
            return new CustomerMenu(this, shop, createCustomer());

            // case 3 --> login as Seller
        } else if (input.equals("3")) {
            inputUsername();
            // check if user exists in database
            if (userName.equals(shop.matchSeller().getName())) {
                inputPassword();
                // check if password is correct
                if (password.equals(shop.matchSeller().getData().getPassword())) {
                    // forward to Seller Menu assigned to this Seller
                    return new SellerMenu(this, shop, shop.matchSeller());
                } else {
                    System.out.println("Wrong password");
                    // return to Login Menu
                    return this;
                }
            } else {
                System.out.println("Unknown user");
                // return to Login Menu
                return this;
            }

            // case 4 --> create new Seller
        } else if (input.equals("4")) {
            System.out.println("New seller");
            // setting username and password
            inputUsername();
            inputPassword();
            //create new seller, assigning username and password to new seller
            //and add to the database
            shop.addSeller(createSeller());
            return new SellerMenu(this, shop, createSeller());

        } else {
            System.out.println("Unknown option");
        }
        // return to Login Menu
        return this;
    }

    public String inputUsername() {
        System.out.println("Enter username");
        userName = user.nextLine();
        return userName;
    }

    public String inputPassword() {
        System.out.println("Enter password");
        password = user.nextLine();
        return password;
    }

    public Customer createCustomer() {
        Customer customer = new Customer();
        AuthenticationData customerData = new AuthenticationData();
        customerData.setLogin(userName);
        customerData.setPassword(password);
        customer.setData(customerData);
        return customer;
    }

    public Seller createSeller() {
        Seller seller = new Seller();
        AuthenticationData sellerData = new AuthenticationData();
        sellerData.setLogin(userName);
        sellerData.setPassword(password);
        seller.setData(sellerData);
        return seller;
    }
}
