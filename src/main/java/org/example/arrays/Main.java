package org.example.arrays;

import org.w3c.dom.ls.LSResourceResolver;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[5]=50;

        double[] doubleArr = new double[10];
        doubleArr[2] = 3.5;
        System.out.println(doubleArr[2]);

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first: " + firstTen[0]);
        int arrLength = firstTen.length;
        System.out.println("length of arr: " + arrLength);
        System.out.println("last element: " + firstTen[arrLength -1]);


//        newArr = new int[]{1,2,3,4,5,6,7,8};
        int[] newArr = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < newArr.length; i++){
            newArr[i] = newArr.length - i;
        }
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
//        System.out.println();
//        for(int element : newArr){
//            System.out.print(element + " ");
//        }
        System.out.println(Arrays.toString(newArr));


        Object objVariable = newArr;
        if(objVariable instanceof int[]){
            System.out.println("objvar is really an int array");

        }

        Object[] objArr = new Object[3];
        objArr[0] = "Hello";
        objArr[1] = new StringBuilder("World");
        objArr[2] = newArr;
    }
}
