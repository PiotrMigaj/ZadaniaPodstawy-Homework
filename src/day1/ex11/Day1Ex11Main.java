package day1.ex11;

import java.util.Random;
import java.util.Scanner;

public class Day1Ex11Main {

    private static final int RANDOM_NUMBER = new Random().nextInt(101);

    public static void main(String[] args) {
        runMyGame();
    }

    public static void runMyGame(){

        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.println("Enter integer number:");
            input = scanner.nextInt();
            scanner.nextLine();

            if (input==RANDOM_NUMBER){
                System.out.println("Bingo");
                break;
            }
            if (input>RANDOM_NUMBER){
                System.out.println("too much");
            }
            if (input<RANDOM_NUMBER){
                System.out.println("not enough");
            }

        }while (input!=RANDOM_NUMBER);

    }

}
