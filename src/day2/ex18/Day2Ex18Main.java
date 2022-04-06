package day2.ex18;

import java.util.Arrays;
import java.util.Random;

public class Day2Ex18Main {

    public static final int NUMBER_OF_INTEGER_DIGITS = 10;

    public static void main(String[] args) {
        runMyApp();
    }

    private static void runMyApp() {

        int[] arrayOfRandomInts = getArrayOfRandomInts();
        //System.out.println("Array of random ints: " + Arrays.toString(arrayOfRandomInts));
        int[] numberOfOccurrencesInTheArray = getNumberOfOccurrencesInTheArray(arrayOfRandomInts);
        //System.out.println("Number od occurance array of random ints: " + Arrays.toString(numberOfOccurrencesInTheArray));
        printNumberOfOccurrencesInTheArray(arrayOfRandomInts, numberOfOccurrencesInTheArray);

    }

    private static int[] getNumberOfOccurrencesInTheArray(int[] array) {

        int[] numberOfOccuranceArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    numberOfOccuranceArray[i]++;
                }
            }
        }
        return numberOfOccuranceArray;
    }

    private static int[] getArrayOfRandomInts() {

        Random random = new Random();
        int[] array = new int[NUMBER_OF_INTEGER_DIGITS];

        for (int i = 0; i < NUMBER_OF_INTEGER_DIGITS; i++) {
            array[i] = random.nextInt(NUMBER_OF_INTEGER_DIGITS);
        }
        return array;
    }

    private static void printNumberOfOccurrencesInTheArray(int[] arrayOfRandomInts, int[] numberOfOccuranceArray) {

        for (int i = 0; i < NUMBER_OF_INTEGER_DIGITS; i++) {
            for (int j = 0; j < NUMBER_OF_INTEGER_DIGITS; j++) {
                if (arrayOfRandomInts[j] == i) {
                    System.out.print(i);
                    System.out.println(" " + numberOfOccuranceArray[j]);
                    break;
                }
            }
        }
    }
}
