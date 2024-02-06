package org.example.arrays.varargs;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello world");
        String[] splitStrings = "Hello world".split(" ");
        printText(splitStrings);
    }
    public static  void printText(String... list){
        for(String text : list){
            System.out.println(text);
        }
    }
}
