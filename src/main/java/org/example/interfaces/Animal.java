package org.example.interfaces;

enum FlightStages implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("monitoring: " + this);
        }
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}

record DragonFly(String name, String type) implements FlightEnabled {
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth {
    FlightStages stage = FlightStages.GROUNDED;

    @Override
    public void takeOff() {
        transition("Taking off");

    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Data collection while orbiting");
    }

    public void transition(String description) {
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }

    public void achieveOrbit() {
        transition("Orbit achieved");
    }
}

interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();

    private static void log(String description) {
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }
}

interface FlightEnabled {
    //redundant
    public static final double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    //redundant
    public abstract void takeOff();

    public void land();

    void fly();

    default FlightStages transition(FlightStages stage) {
//        System.out.println("transition not implemented on: " + this.getClass().getName());
//        return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }
}

interface Trackable {
    void track();
}

public abstract class Animal {
    public abstract void move();
}
