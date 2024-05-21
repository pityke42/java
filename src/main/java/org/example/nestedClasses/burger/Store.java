package org.example.nestedClasses.burger;

public class Store {
    public static void main(String[] args) {
        Meal meal = new Meal();
        System.out.println(meal);

        Meal usregularmeal = new Meal(0.68);
        System.out.println(usregularmeal);
    }
}
