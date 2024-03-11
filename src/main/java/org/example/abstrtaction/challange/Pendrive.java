package org.example.abstrtaction.challange;
public class Pendrive extends ProductForSale{
    public Pendrive(String type, int price, String description) {
        super(type, price, description);
    }
    @Override
    public void showDetails() {
        System.out.println("this is: " + type);
        System.out.println("this " + price);
        System.out.println(description);
    }
}
