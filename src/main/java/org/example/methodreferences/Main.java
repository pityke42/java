package org.example.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("anna", "bob", "chuck", "dave"));
        list.forEach(System.out::println);

        calculator(Integer::sum, 10, 25);
        calculator(Double::sum, 2.5, 7.5);

        Supplier<PlainOld> reference = () -> new PlainOld();
        Supplier<PlainOld> reference1 = PlainOld::new;

        PlainOld newPojo = reference1.get();

        PlainOld[] pojo1 = seedArray(PlainOld::new, 10);

        calculator((s1, s2) -> s1.concat(s2), "hello ", " world");
        calculator(String::concat, "hello ", " world");

        BinaryOperator<String> b1 = (s1, s2) -> s1.concat(s2);
        BinaryOperator<String> b2 = String::concat;
        BiFunction<String,String,String> b3 = String::concat;
        UnaryOperator<String> u1 = String::toUpperCase;

        System.out.println(b1.apply("Hello " , "World"));
        System.out.println(b2.apply("Hello " , "world"));
        System.out.println(u1.apply("Hello "));

        String result = "Hello".transform(u1);
        System.out.println(result);

        result = result.transform(String::toLowerCase);
        System.out.println(result);

        Function<String, Boolean> f0 = String::isEmpty;
        boolean resultBoolean = result.transform(f0);
        System.out.println(resultBoolean);

    }

    private static <T> void calculator(BinaryOperator<T> func, T val1, T val2) {
        T result = func.apply(val1, val2);
        System.out.println("result operation : " + result);
    }

    private static PlainOld[] seedArray(Supplier<PlainOld> reference, int count) {
        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array, i -> reference.get());
        return array;
    }
}

class PlainOld {
    private static int last_id = 1;
    private int id;

    public PlainOld() {
        id = PlainOld.last_id++;
        System.out.println("creating a plainold object: id = " + id);
    }
}
