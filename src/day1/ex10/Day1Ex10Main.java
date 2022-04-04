package day1.ex10;

import java.util.Arrays;

public class Day1Ex10Main {
    public static void main(String[] args) {

        int number = 123;
        runMyApp(number);

        number = 6;
        runMyApp(number);

        number = 1036;
        runMyApp(number);

        number = 0;
        runMyApp(number);

    }

    private static void runMyApp(int number) {

        if (countHowManyDigitsInNumber(number) > 0) {

            int arraySize = countHowManyDigitsInNumber(number);
            int[] arrayOfDigits = convertNumberToArrayOfDigits(number, arraySize);
            int sum = addElementsOfIntArray(arrayOfDigits);
            System.out.println(sum);

        }else{
            System.out.println(0);
        }

    }

    private static int countHowManyDigitsInNumber(int number) {

        int digitCounter = 0;

        while (number > 0) {

            digitCounter++;
            number /= 10;

        }
        return digitCounter;
    }

    private static int[] convertNumberToArrayOfDigits(int number, int arraySize) {

        int[] arrayOfDigits = new int[arraySize];

        for (int i = 0; i < arrayOfDigits.length; i++) {
            arrayOfDigits[i] = number % 10;
            number /= 10;
        }

        return arrayOfDigits;
    }

    private static int addElementsOfIntArray(int[] arrayOfInt) {

        int sum = 0;

        for (int x :
                arrayOfInt) {
            sum += x;
        }
        return sum;
    }
}
