package org.example.composition.computerFactory;

public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product{
    private int size;
    private String resolution;
    public void drawPixelAt(int x, int y, String color){
        System.out.println(String.format(
                "Drawing pixel at %d,%d in color %s ", x, y, color
        ));
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }
}

class Motherboard extends Product{
    private int ramSlots;
    private int cardSlots;
    private String bios;
    public void loadProgram(String programName){

        System.out.println("Program" + programName + " is loading");
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bois) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bois;
    }

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }
}

class ComputerCase extends Product{
    private String powerSupply;
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }
}
