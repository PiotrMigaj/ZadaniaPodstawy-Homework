package day2.ex19;

import java.util.Arrays;

public class Day2Ex19 {
    public static void main(String[] args) {

        runMyApp();

    }

    private static void runMyApp() {

        int[][] firstArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] secondArray = {{10, -1, 5}, {-25, 6, 6}, {12, 8, 9}};
        compareSumOfElementsOfTwoArrays(firstArray, secondArray);
        int biggestNumber = getBiggestNumberFromTwoDArrays(firstArray, secondArray);
        System.out.println("The biggest value is: " + biggestNumber);
        int lowestNumber = getLowestNumberFromTwoDArrays(firstArray, secondArray);
        System.out.println("The lowest value is: " + lowestNumber);
    }

    private static int sumOfArrayElements(int[][] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    private static void compareSumOfElementsOfTwoArrays(int[][] firstArray, int[][] secondArray) {

        int sumElementsOfFirstArray = sumOfArrayElements(firstArray);
        int sumElementsOfSecondArray = sumOfArrayElements(secondArray);
        if (sumElementsOfFirstArray > sumElementsOfSecondArray) {
            System.out.println("Bigger array is: " + Arrays.deepToString(firstArray));
        }
        if (sumElementsOfFirstArray < sumElementsOfSecondArray) {
            System.out.println("Bigger array is: " + Arrays.deepToString(secondArray));
        }
        if (sumElementsOfFirstArray == sumElementsOfSecondArray) {
            System.out.println("Sums of elements od array are equal: " + Arrays.deepToString(firstArray));
        }
    }

    private static int getLowestNumberFromTwoDArrays(int[][] firstArray, int[][] secondArray) {

        int lowestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[0].length; j++) {
                if (firstArray[i][j] < lowestNumber) {
                    lowestNumber = firstArray[i][j];
                }
            }
        }
        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[0].length; j++) {
                if (secondArray[i][j] < lowestNumber) {
                    lowestNumber = secondArray[i][j];
                }
            }
        }
        return lowestNumber;
    }

    private static int getBiggestNumberFromTwoDArrays(int[][] firstArray, int[][] secondArray) {

        int biggestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[0].length; j++) {
                if (firstArray[i][j] > biggestNumber) {
                    biggestNumber = firstArray[i][j];
                }
            }
        }
        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[0].length; j++) {
                if (secondArray[i][j] > biggestNumber) {
                    biggestNumber = secondArray[i][j];
                }
            }
        }
        return biggestNumber;
    }
}
