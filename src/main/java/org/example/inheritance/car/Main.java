package org.example.car;

import org.example.car.Car;

public class Main {
    public static void main(String args[]){
        Car car = new Car("Porsche", "carrera gt", "silver", 3, true);
        Car car2 = new Car();
        car.describeCar();
        System.out.println(car.getColor());
        car.setColor("Black");
        System.out.println(car.getColor());
        System.out.println(car2.getColor() + car2.getMake());
    }
}
