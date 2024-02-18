package org.example.composition.challange;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;
    public SmartKitchen(){
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
        brewMaster = new CoffeeMaker();
    }

    public void addWater(){
        iceBox.orderFood();
    }
    public void pourMilk(){
        brewMaster.brewCoffee();
    }
    public void loadDishWasher(){
        dishWasher.doDishes();
    }
    public void setKitchenState(boolean caf, boolean dis, boolean ref){
        iceBox.setHasWorkToDo(ref);
        brewMaster.setHasWorkToDo(caf);
        dishWasher.setHasWorkToDo(dis);
    }
    public void doKitchenWork(){
       iceBox.orderFood();
       brewMaster.brewCoffee();
       dishWasher.doDishes();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
}
class CoffeeMaker{
    private boolean hasWorkToDo;
    public void brewCoffee(){
        if(hasWorkToDo) System.out.println("brewing ");
         hasWorkToDo = false;
    }
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
class DishWasher{
    private boolean hasWorkToDo;
    public void doDishes(){
        if(hasWorkToDo) System.out.println("doing dishes");
        hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
class Refrigerator{
    private boolean hasWorkToDo;
    public void orderFood(){
        if(hasWorkToDo) System.out.println("ordering ");
        hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
