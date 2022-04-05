package day2.ex10;

import day2.IStringHelper;

import java.util.Arrays;
import java.util.Scanner;

public class Day2Ex10Main {
    public static void main(String[] args) {
        runMyApp();
    }

    public static void runMyApp(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of words you wanna type: ");
        int numberOfStrings = scanner.nextInt();
        scanner.nextLine();

        String[] arrayOfString = arrayOfStrings(scanner,numberOfStrings);

        String result = wordMadeOfLastLetterOfStrings(arrayOfString);

        System.out.println(result);

    }

    private static String[] arrayOfStrings(Scanner scanner, int numberOfStrings){

        String[] array = new String[numberOfStrings];
        for (int i =0;i<array.length;i++){
            array[i]= scanner.nextLine();
        }
        return array;
    }

    private static String wordMadeOfLastLetterOfStrings(String[] array){
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<array.length;i++){
            if (IStringHelper.isTextValid(array[i])){
                sb.append(array[i].charAt(array[i].length()-1));
            }
        }
        return sb.toString();
    }
}
