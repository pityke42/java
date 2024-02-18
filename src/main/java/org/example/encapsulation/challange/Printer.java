package org.example.encapsulation.challange;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = (tonerLevel <= 0 && tonerLevel >= 100) ? -1 : tonerLevel;
        this.duplex = duplex;
        this. pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
        int tonerSum = tonerAmount + tonerLevel;
        if(tonerSum < 0 && tonerSum > 100) return -1;
        tonerLevel += tonerSum;
        return tonerLevel;
    }
    public int printPages(int pages){
        pagesPrinted += (duplex) ? (pages /2) +(pages%2) : pages;
        return pagesPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
