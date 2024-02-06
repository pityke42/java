package org.example.polymorphism.oopChallange;

public class Meal {
    private Item side;
    private Item drink;
    private Burger burger;

    public Meal() {}

    public void addToppings(){}
    public void setDrinkSize(Item drink){
        this.drink = drink;
    }
    public void printItemisedList(){}
    public  void printTotal(){}
}
class Burger extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String type, double price) {
        super(type, price);
    }

    public void addTopping(){

    }
}
class Item{
    private String name;
    private String type;
    private double price;
    private String size;
    public Item(String type, double price, String name, String size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public Item(String type, double price) {
        this.type = type;
        this.price = price;
    }
    public double getBasedPrice(){return price;}
    public double getAdjustedPrice(){return 1;}
    public void printItem(){
        System.out.println("You ordered: " + name);
    }
}
