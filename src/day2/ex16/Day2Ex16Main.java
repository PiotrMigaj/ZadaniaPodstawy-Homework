package day2.ex16;

import java.util.Arrays;

public class Day2Ex16Main {
    public static void main(String[] args) {
        runMyApp();
    }

    private static void runMyApp(){
        int[] inputArray = {12,9,17};
        System.out.println(Arrays.toString(inputArray));
        swapFirstAndLastElementOfArray(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }

    private static void swapFirstAndLastElementOfArray(int[] array){

        int tmp = array[0];
        array[0]= array[array.length-1];
        array[array.length-1]=tmp;

    }


}
