package org.example.arrays.challange.solution;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = createRandomNumber(5);
        System.out.println(Arrays.toString(arr));

        int[] sortedArr = descendSort(arr);
        System.out.println(Arrays.toString(sortedArr));

    }
    public static int[] createRandomNumber(int len){
        Random random = new Random();
        int[] randomArr = new int[len];
        for(int i = 0; i <  randomArr.length; i++){
            randomArr[i] = random.nextInt(100);
            }
        return randomArr;
    }
    public static  int[] descendSort(int[] arr){
        System.out.println(Arrays.toString(arr));
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArr.length -1; i++){
                if(sortedArr[i] < sortedArr[i + 1]){
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i + 1];
                    sortedArr[i + 1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(sortedArr));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArr));
        }
        return sortedArr;
    }
}
