package org.example.arrays.challange;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = createRandomArray(4);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] desc = descendingOrder(arr);
        System.out.println(Arrays.toString(desc));
    }
    public static int[] descendingOrder(int[] arr) {
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[arr.length -1-i];
        }
        return temp;
    }
    public static int[] createRandomArray(int len) {
        Random random = new Random();
        int[] newArrInt = new int[len];
        for (int i = 0; i < len; i++) {
            newArrInt[i] = random.nextInt(100);
        }
        return newArrInt;
    }
}
