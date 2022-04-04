package day1.ex13;

import java.util.Scanner;

public class Day1Ex13Main {

    public static void main(String[] args) {

        runMyApp();

    }

    private static void runMyApp() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer numbers. Terminate with 0.");

        int input = 0;
        int sum = 0;
        int numberOfNumbers = 0;
        float arithmeticAverage = 0;
        int numberOfEvenNumbers = 0;

        do {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            if (isEvenNumber(input)){
                numberOfEvenNumbers++;
            }

            sum += input;
            numberOfNumbers++;

        } while (input != 0);

        System.out.println("Total Number Of Digits: " + numberOfNumbers);
        System.out.println("Total Number Of Even Digits: "+numberOfEvenNumbers);

        if (numberOfNumbers != 0) {
            arithmeticAverage = calculateArithmeticAverage(sum, numberOfNumbers);
            System.out.println("Arithmetic Average: " + arithmeticAverage);
        }

    }

    private static <T extends Number> float calculateArithmeticAverage(T sum, T numberOfNumbers) {

        return sum.floatValue() / numberOfNumbers.floatValue();

    }

    private static boolean isEvenNumber(int number) {

        return number % 2 == 0 ? true :false;

    }


}
