package org.example.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main  {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        bird.move();
//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

        inFlight(flier);

        inFlight(new Jet());


        Trackable truck = new Truck();
        truck.track();

        double kmTraveled = 100;
        double milesTraveled = kmTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("the truck traveled %.2f km or %.2f miles %n", kmTraveled, milesTraveled);


        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);
    }
private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
}
private static void triggerFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.takeOff();
        }
}
private static void flyFliers(List<FlightEnabled> fliers){
        for (var flier : fliers){
            flier.fly();
        }
}
    private static void landFliers(List<FlightEnabled> fliers){
        for (var flier : fliers){
            flier.land();
        }
    }

}
