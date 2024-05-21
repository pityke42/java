package org.example.lambda.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };
        printTheParts.accept("egyszer volt hol nem volt");

        Consumer<String> lamb = (s) -> {
            String[] parts = s.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        lamb.accept("volt egyszer hol nem");

        Consumer<String> lamb2 = (s) -> Arrays.asList(s.split(" ")).forEach(s2 -> System.out.println(s2));
        lamb2.accept("turelem torna terem");


        UnaryOperator<String> everySecondLambda = source -> {
            StringBuilder returnValue = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnValue.append(source.charAt(i));
                }
            }
            return returnValue.toString();
        };
        System.out.println(everySecondLambda.apply("1234567890 "));


        String result = everySecondCharacter(everySecondLambda, "1234567890");
        System.out.println(result);

        Supplier<String> iLoveJava = () -> "I Love Java";
        System.out.println(iLoveJava.get());


    }

    public static String everySecondChar(String source) {
        StringBuilder returnValue = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnValue.append(source.charAt(i));
            }
        }
        return returnValue.toString();
    }

    public static String everySecondCharacter(Function<String, String> func, String source) {
        return func.apply(source);
    }
}
