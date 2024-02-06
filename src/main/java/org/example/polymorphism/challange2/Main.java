package org.example.polymorphism.challange2;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi R8");
        runRace(audi);
        Car tesla = new ElectricCar("Tesla", 800, 2);
        runRace(tesla);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
