package org.example.inheritance.inheritance;

public class Fish extends Animal{
    private int gills;
    private int fins;
    private void moveMuscles(){
        System.out.println("muscles moving");
    }
    private void moveBackFins(){
        System.out.println("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast"){
            moveBackFins();
        }
        System.out.println();
    }

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
