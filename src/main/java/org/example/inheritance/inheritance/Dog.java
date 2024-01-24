package org.example.inheritance.inheritance;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;


    public Dog() {
        super("Mutt", "Big", 900);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");

        if(speed == "slow"){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }
    private void bark(){
        System.out.println("woof");
    }
    private void run(){
        System.out.println((type == "Wolf" ? "wolf" : "dog") + " running");
    }
    private void walk(){
        System.out.println((type == "Wolf" ? "wolf" : "dog") +" walking");
    }
    private void wagTail(){
        System.out.println((type == "Wolf" ? "wolf" : "dog") + " Tail wagging");
    }

    public void makeNoise(){
        if(type == "Wolf") System.out.println("Ow owwwwww");
        bark();
        System.out.println("make niose method");
    }

}
