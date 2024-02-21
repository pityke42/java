package org.example.abstrtaction.challange;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getPrice(int quantity){
        System.out.println(quantity * price);
        return quantity * price;
    }
    public void printPriced(int quantity){
        System.out.printf("%2d quantity $%8.2f each, %-15s %-35s %n", quantity, price, type, description);
    }
    public abstract void showDetails();

}
