package day2.ex7;

import day2.IStringHelper;

public class Day2Ex7Main {
    public static void main(String[] args) {
        runMyApp();
    }

    private static void runMyApp() {

        String input = "Ala ma kota";

        if (IStringHelper.isTextValid(input)) {
            float percentageOfSpacesInString = getPercentageOfSpacesInString(input);
            System.out.println(percentageOfSpacesInString);
        }

    }

    private static int countSpaces(String input) {

        int numberOfSpacesInString = input
                .replaceAll("[^ ]", "")
                .length();

        return numberOfSpacesInString;
    }

    private static float getPercentageOfSpacesInString(String input) {

        int numberOfSpacesInString = countSpaces(input);
        int numberOfSignInString = input.length();
        float percentageOfSpacesInString = 100.0f * numberOfSpacesInString / numberOfSignInString;

        return percentageOfSpacesInString;

    }
}
