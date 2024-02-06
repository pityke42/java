package org.example.arrays.TwoDArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        System.out.println(Arrays.toString(arr));
        System.out.println("array length: " + arr.length);

        for(int[] outer : arr){
            System.out.println(Arrays.toString(outer));
        }
        for(int i = 0; i < arr.length; i++){
            var innerArr = arr[i];
            for( int j = 0; j < innerArr.length; j++){
//                System.out.print(arr[i][j]);
                arr[i][j] = (i * 10) + (j + 1);
            }
//            System.out.println();
        }

        for(var outer : arr){
            for(var element : outer){
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));

        arr[1] = new int[]{10,20,30};
        System.out.println(Arrays.deepToString(arr));

        Object[] anyAr = new Object[3];
        System.out.println(Arrays.toString(anyAr));

        anyAr[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyAr));

        anyAr[1] = new String[][]{
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}};
        System.out.println(Arrays.deepToString(anyAr));

        anyAr[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyAr));

        for(Object element : anyAr){
            System.out.println("Element type: "+ element.getClass().getSimpleName());
            System.out.println("Element toString: " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }


    }
}
