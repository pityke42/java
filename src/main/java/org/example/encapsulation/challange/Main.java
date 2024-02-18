package org.example.encapsulation.challange;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("initial pages: "+ printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.println(pagesPrinted);
    }
}
