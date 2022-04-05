package day2.ex9;

import day2.IStringHelper;

import java.util.Scanner;

public class Day2Ex9Main {

    public static void main(String[] args) {
        runMyApp();
    }

    private static void runMyApp() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int countLetters = 0;
        String maxLengthString = "";

        do {
            System.out.print("Please insert your text: ");
            input = scanner.nextLine();

            if (input.equals("Enough")) {
                break;
            }
            if (!IStringHelper.isTextValid(input)) {
                System.out.println("No input");
            }
            if (input.length() > maxLengthString.length()) {
                maxLengthString = input;
            }

        } while (true);

        System.out.println(maxLengthString);
    }
}
