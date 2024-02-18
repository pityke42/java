package org.example.polymorphism.challange;

public class Main {
    public static void main(String[] args) {
        Car car = Car.makeCarType("gas", "volvo 2334");
        car.startEngine();
    }
    public static void runRace(Car car){
        car.startEngine();
    }
}

