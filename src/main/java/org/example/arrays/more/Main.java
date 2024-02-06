package org.example.arrays.more;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArr = getRandomArray(10);
        System.out.println(Arrays.toString(firstArr));
        Arrays.sort(firstArr);
        System.out.println(Arrays.toString(firstArr));

        int[] secondArr = new int[10];
        System.out.println(Arrays.toString(secondArr));
        Arrays.fill(secondArr, 5);
        System.out.println(Arrays.toString(secondArr));

        int[] thirdArr = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArr));

        //copyOf() creates a new array and new instances of an array copies the elements over the new array
        //primitives: values gets copied
        //objects: object references gets copied
        int[] fourthArr = Arrays.copyOf(thirdArr, thirdArr.length);
        System.out.println(Arrays.toString(fourthArr));

        Arrays.sort(fourthArr);
        System.out.println(Arrays.toString(thirdArr));
        System.out.println(Arrays.toString(fourthArr));

        int[] smallArr = Arrays.copyOf(thirdArr, 5);
        System.out.println(Arrays.toString(smallArr));

        int[] largeArr = Arrays.copyOf(thirdArr, 15);
        System.out.println(Arrays.toString(largeArr));


    }
    private static  int[] getRandomArray(int len){

        Random random = new Random();
        int[] newInt = new int[len];
        for(int i =0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
