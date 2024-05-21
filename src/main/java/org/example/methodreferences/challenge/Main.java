package org.example.methodreferences.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {
    private static Random random = new Random();
    private record Person(String first){
        private String last(String s){
            return first + " " + s.substring(0, s.indexOf(" "));
        }
    }
    public static void main(String[] args) {
        String[] names = {"anna", "bob", "chuck", "dave", "eva", "francis"};

        Person tim = new Person("Tim");

        List<UnaryOperator<String>> list = new ArrayList<>(List.of(
                String::toUpperCase,
                s -> s += " " + getRandomChar('D', 'M') + " .",
                s -> s+= " " + reverse(s, 0 , s.indexOf(" ")),
                Main::reverse,
                String::new,
                s -> new String(s),
                String::valueOf,
                tim::last,
                (new Person("MARY"))::last
        ));
        applyChanges(names, list);

        UnaryOperator<String> upper = String::toUpperCase;
    }
    private static void applyChanges(String[] names,
                                     List<UnaryOperator<String>> stringFunction){
        List<String> backedArray = Arrays.asList(names);
        for(var function : stringFunction){
            backedArray.replaceAll(s -> s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }
    private static char getRandomChar(char startChar, char endChar){
        return (char) random.nextInt((int) startChar, (int) endChar + 1);
    }
    private static String reverse(String s, int start, int end){
        return new StringBuilder(s.substring(start, end)).reverse().toString();
    }
    private static  String reverse(String s){
        return reverse(s, 0, s.length());
    }
}
