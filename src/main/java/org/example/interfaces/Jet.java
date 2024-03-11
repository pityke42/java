package org.example.interfaces;

public class Jet implements Trackable, FlightEnabled{
    @Override
    public FlightStages transition(FlightStages stage) {
        System.out.println(getClass().getSimpleName() + " is transitioning");
        return FlightEnabled.super.transition(stage);
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println( getClass().getSimpleName() + " coordinates recorded");
    }
}
