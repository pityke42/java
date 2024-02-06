package org.example.arrays.methods.binarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] sArr = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArr);
        System.out.println(Arrays.toString(sArr));
        if(Arrays.binarySearch(sArr, "Mark") >= 0){
            System.out.println("Found mark in the list");
        }


        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        if (Arrays.equals(s1,s2)) System.out.println("Arrays are equal");
        else System.out.println("Arrays are not equal");
    }}
