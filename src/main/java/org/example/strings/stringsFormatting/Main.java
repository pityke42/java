package org.example.strings.stringsFormatting;

public class Main {
    public static void main(String[] args){
        printInformation("Hello world");
//        printInformation("");
        printInformation("\n     \t");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of world = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("lastindex of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("lastindex of l = %d %n", helloWorld.lastIndexOf('l', 8));

    }
    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        System.out.printf("First character = %c %n", string.charAt(0));

        if(string.isEmpty()){
            System.out.println("String is empty");
            return;
        }
        if(string.isBlank()){
            System.out.println("String is blank");
            return;
        }
    }
}
