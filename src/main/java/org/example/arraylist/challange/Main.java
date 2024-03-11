package org.example.arraylist.challange;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            print();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItem(list);
                case 2 -> removeItem(list);
                default -> flag = false;
            }
            list.sort(Comparator.naturalOrder());
            System.out.println(list);
        }

    }

    public static void addItem(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            if (list.indexOf(trimmed) < 0) {
                list.add(trimmed);
            }
        }
    }

    public static void removeItem(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            list.remove(trimmed);
        }
    }

    public static void print() {
        String text = """
                choose
                1-add
                2-remove
                0-shutdown
                """;
        System.out.println(text);
    }
}

