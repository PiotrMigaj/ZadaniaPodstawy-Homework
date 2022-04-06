package day2.ex20;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Day2Ex20Main {
    public static void main(String[] args) {
        runMyApp();
    }

    private static void runMyApp(){
        int length = 5;
        int firstElement = 3;
        int odds = 3;

        if (length>=3){
            int[] arithmeticSequenceArray = generateArithmeticSequence(length,firstElement,odds);
            System.out.println("Result: "+Arrays.toString(arithmeticSequenceArray));
            System.out.println(isArithmeticSequenceArray(arithmeticSequenceArray));
        }

        System.out.println();
        int[] testArray = {3,6,9,15};
        System.out.println("Is arithemtic sequence - test array: " +Arrays.toString(testArray));
        System.out.println(isArithmeticSequenceArray(testArray));
    }

    private static int[] generateArithmeticSequence(int length, int firstElement, int odds){

        int[] arithmeticSequenceArray = new int[length];
        for (int i =0;i<arithmeticSequenceArray.length;i++){
            int nElement = i+1;
            arithmeticSequenceArray[i]=getNElementOfArithmeticSequence(firstElement,odds,nElement);
        }
        return arithmeticSequenceArray;
    }

    private static int getNElementOfArithmeticSequence(int firstElement, int odds, int nElement){
        return firstElement+(nElement-1)*odds;
    }

    private static boolean isArithmeticSequenceArray(int[] array){

        int firsElement = array[0];
        int secondElement = array[1];
        int odds = secondElement-firsElement;
        for (int i = 1;i<array.length-1;i++){
            if (array[i+1]-array[i]!=odds){
                return false;
            }
        }
        return true;
    }
}
