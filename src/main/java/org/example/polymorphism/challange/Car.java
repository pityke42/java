package org.example.polymorphism.challange;

public class Car {
    private String description;

    public Car(String description) {this.description = description;}


    public void startEngine(){
        //Printing Runtime Type
        String instanceType = this.getClass().getSimpleName();
        System.out.println("Car "+description + " is " + instanceType + " car");
    }
    public void drive(){

    }
    protected void runEngine(){

    }
    public static Car makeCarType(String type, String description){
        return switch (type.toUpperCase().charAt(0)){
            case 'G' -> new GasPoweredCar(description);
            case 'E' -> new ElectricCar(description);
            case 'H' -> new HybridCar(description);
            default -> new Car(description);
        };
    }
}
class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;
    public GasPoweredCar(String description){
        super(description);
    }
    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("Gas -> powered coughing on its own gas");
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
}
class ElectricCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    public ElectricCar(String description){
        super(description);
    }
    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("Electric -> trash does not know where is te next charging park");
    }
}
class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;
    public HybridCar(String description){
        super(description);
    }
    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("Hybrid -> car does not know its identity");
    }
}

