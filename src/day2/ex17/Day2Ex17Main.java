package day2.ex17;

import java.util.Arrays;
import java.util.Scanner;

public class Day2Ex17Main {

    public static final int LENGTH_OF_INPUT_ARRAY = 10;

    public static void main(String[] args) {
        runMyApp();
    }

    private static void runMyApp(){

        int[] array = new int[LENGTH_OF_INPUT_ARRAY];
        getValueFromUserToArray(array);
        bubbleSortingOfArray(array);
        System.out.println(Arrays.toString(array));

    }

    private static void getValueFromUserToArray(int[] array){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter "+LENGTH_OF_INPUT_ARRAY+" integer numbers:");
        for (int i = 0; i< LENGTH_OF_INPUT_ARRAY; i++){
            array[i]=scanner.nextInt();
        }
    }

    private static void bubbleSortingOfArray(int[] array){

        for (int i=1;i< array.length;i++){
            for (int j= array.length-1;j>=i;j--){
                if(array[j-1]>array[j]){
                    int tmp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=tmp;
                }
            }
        }
    }
}
