package org.example.polymorphism.challange2;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> engine start");
    }
    public void drive(){
        String type = this.getClass().getSimpleName();
        System.out.println("Car -> car is moving, type is: " + type);
        runEngine();
    }
    protected void runEngine(){
        System.out.println("Car -> run engine");
    }
}
class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine(){
        System.out.println("GasCar -> engine start");
    }
    @Override
    public void drive(){
        String type = this.getClass().getSimpleName();
        System.out.println("GasCar -> car is moving, type is: " + type);
        runEngine();
    }
    @Override
    protected void runEngine(){
        System.out.println("GasCar -> run engine");
    }

}
class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int battery;

    public ElectricCar(String description, double avgKmPerCharge, int battery) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.battery = battery;
    }
    @Override
    public void startEngine(){
        System.out.println("Ev -> engine start");
    }
    @Override
    public void drive(){
        String type = this.getClass().getSimpleName();
        System.out.println("Ev -> car is moving, type is: " + type);
        runEngine();
    }
    @Override
    protected void runEngine(){
        System.out.println("Ev -> run engine");
    }

}
class Hybrid extends Car{
    private double avgKmPerLitre;
    private int cylinders;
    private int battery;

    public Hybrid(String description, double avgKmPerLitre, int cylinders, int battery) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.battery = battery;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine(){
        System.out.println("Hy -> engine start");
    }
    @Override
    public void drive(){
        String type = this.getClass().getSimpleName();
        System.out.println("Hy -> car is moving, type is: " + type);
        runEngine();
    }
    @Override
    protected void runEngine(){
        System.out.println("Hy -> run engine");
    }

}

