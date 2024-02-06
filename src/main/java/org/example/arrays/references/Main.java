package org.example.arrays.references;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         int[] arr = new int[5];
         int[] arr2 = arr;

        System.out.println("arr -> " + Arrays.toString(arr));
        System.out.println("arr2 -> " + Arrays.toString(arr2));

        arr2[0] = 1;
        System.out.println("arr -> " + Arrays.toString(arr));
        System.out.println("arr2 -> " + Arrays.toString(arr2));

        modifyArray(arr);
        System.out.println("arr -> " + Arrays.toString(arr));
        System.out.println("arr2 -> " + Arrays.toString(arr2));
    }
    public static  void modifyArray(int[] arr){
        arr[1] = 2;
    }
}
