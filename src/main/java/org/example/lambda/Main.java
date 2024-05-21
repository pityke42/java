package org.example.lambda;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

@FunctionalInterface
 interface Operation <T>{
    T operate(T value1, T value2);
}
public class Main {
    record Person(String firstName, String lastName){
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("laci", "lali"),
                new Person("sanyi", "nagy"),
                new Person("feri", "kicsi"),
                new Person("bela", "kozepes"),
                new Person("karoly", "sokadik"),
                new Person("joco", "az utolso")
        ));

        //anonymous class
        var comparatorLastName = new Comparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName);
            }
        };
        people.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName));
        System.out.println(people);


        interface EnhancedComparator<T> extends Comparator<T>{
            int secondLevel(T o1, T o2);
        }
        var comparatorMixed = new EnhancedComparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName.compareTo(o2.lastName);
                return (result == 0 ? secondLevel(o1, o2) : result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.firstName);
            }
        };
        people.sort(comparatorMixed);
        System.out.println(people);

        int result = calculator((a, b) -> a + b, 5, 2);
        var result2 = calculator((a, b) -> a + b, "kutya","cica");

        var coords = Arrays.asList(
                new double[]{47.2160, -952348},
                new double[]{29.1566, -892495},
                new double[]{35.1556, -90.0659}
        );

        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        BiConsumer<Double, Double> p1 = (lat, lng) ->
                System.out.printf("[lat:%3f lon:%3f]%n", lat, lng);

        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);

        coords.forEach(s -> processPoint(s[0], s[1], p1));

        List<String> list = new ArrayList<>(List.of("alpha", "bravo", "charlie", "delta"));
        list.removeIf(s -> s.equalsIgnoreCase("bravo"));
        System.out.println(list);

        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        System.out.println(list);

        String[] emptyStrings = new String[10];
        System.out.println(Arrays.toString(emptyStrings));
        Arrays.fill(emptyStrings, "");
        System.out.println(Arrays.toString(emptyStrings));
        Arrays.setAll(emptyStrings, i -> "" + (i+1) + ". " +
                switch (i){
            case 0 -> "one";
            case 1 -> "two";
            case 2 -> "three";
                    default -> "";
        });
        System.out.println(Arrays.toString(emptyStrings));

        String[] names = {"anna", "bob","carol","david","ed","fred"};
        String[] randomList = randomSelectedValues(15, names, () -> new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(randomList));

    }

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2){
        T result = function.apply(value1, value2);
        System.out.println("result of the operation : " + result);
        return result;
    }
    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer){
        consumer.accept(t1, t2);
    }
    public static String[] randomSelectedValues(int count,
                                                String[] values,
                                                Supplier<Integer> s){
        String[] selectedValues =new String[count];
        for(int i = 0; i < count; i++){
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }
}
