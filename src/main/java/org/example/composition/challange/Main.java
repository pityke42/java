package org.example.composition.challange;

public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();



        kitchen.getBrewMaster().setHasWorkToDo(true);
        kitchen.getDishWasher().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);

        kitchen.getIceBox().orderFood();
        kitchen.getDishWasher().doDishes();
        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true, true, true);

        kitchen.doKitchenWork();
    }
}
