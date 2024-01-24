package org.example.strings.stringFormatting;

public class Main {
    public static void main(String[] args){
        String bulletList = "Pring a bullet list: \n" +
                "\t\u2022 First point\n" +
                "\t\t\u2022 Sub point";
        System.out.println(bulletList);

        String textBlock = """
                Print a bullet list: 
                    \u2022 First point
                        \u2022 Sub point""";
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d", age);

        int yearOfBirth = 2023 -age;
        System.out.printf("\nAge = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);

        for(int i = 1; i <= 10000; i *= 10){
            System.out.printf("Printing  %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }

}
