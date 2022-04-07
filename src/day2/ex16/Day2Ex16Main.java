package day2.ex16;

import java.util.Arrays;

public class Day2Ex16Main {
    public static void main(String[] args) {
        runMyApp();
    }

    private static void runMyApp(){
        int[] inputArray = {12,7,19};
        System.out.println("Initial array: "+Arrays.toString(inputArray));
        swapFirstAndLastElementOfArray(inputArray);
        System.out.println("Array after swaping first with last element: "+Arrays.toString(inputArray));
        System.out.println();
        inputArray = new int[]{12,7,19,33};
        System.out.println("Initial array: "+Arrays.toString(inputArray));
        reverseElementsOfArray(inputArray);
        System.out.println("Array after reversing elements: "+Arrays.toString(inputArray));
    }

    private static void swapFirstAndLastElementOfArray(int[] array){

        int tmp = array[0];
        array[0]= array[array.length-1];
        array[array.length-1]=tmp;
    }

    private static void reverseElementsOfArray(int[] array){

        for (int i=0;i< array.length/2;i++){
            if (array[i]==array[array.length-1-i]){
                continue;
            }
            int tmp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=tmp;
        }

    }


}
