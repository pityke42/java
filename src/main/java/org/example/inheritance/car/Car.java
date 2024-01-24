package org.example.car;

public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gery";
    private int doors = 2;
    private boolean convertible = true ;
    public Car(){
        this("audi", "r8", "black", 3, true);
        System.out.println("Empty constructor called");
    }
    public Car(String make, String model, String color, int doors, boolean convertible){
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.convertible = convertible;
    }
    public String getMake(){
        return make;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getModel(){
        return model;
    }
    public void setMake(String make){
        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupportable";
            }
        }

    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Doors "+
                color + " "+
                make + " " +
                model + " "+
                (convertible ? "Convertible" : ""));
    }
}
