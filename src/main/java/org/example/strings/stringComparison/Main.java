package org.example.strings.stringComparison;

public class Main {
    public static void main(String[] args){
        String helloworld = "Hello world";
        String helloworldLower = helloworld.toLowerCase();
        if (helloworldLower.equals(helloworldLower)) {
            System.out.println("values matches exactly");
        }
        if(helloworld.equalsIgnoreCase(helloworldLower)){
            System.out.println("values match ignoring case");
        }
        if(helloworld.startsWith("Hello")){
            System.out.println("string starts with hello");
        }
        if (helloworld.endsWith("world")){
            System.out.println("string ends with world");
        }
        if(helloworld.contains("world")){
            System.out.println("string contains world");
        }
        if(helloworld.contentEquals("Hello world")){
            System.out.println("values match exactly");
        }
    }
}
