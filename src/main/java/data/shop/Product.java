package data.shop;

public class Product {
    String name;
    String description;
    boolean published;
    double price;

    public Product(String name, String description, boolean published, double price) {
        this.name = name;
        this.description = description;
        this.published = published;
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
