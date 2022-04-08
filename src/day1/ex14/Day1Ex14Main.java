package day1.ex14;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Day1Ex14Main {

    private static final int MIN_VALUE_OF_LOAN_AMOUNT = 100;
    private static final int MAX_VALUE_OF_LOAN_AMOUNT = 10000;
    private static final int DEFAULT_MAX_VALUE_OF_LOAN_AMOUNT = 5000;
    private static final int DEFAULT_MIN_VALUE_OF_LOAN_AMOUNT = 1000;

    private static final int DEFAULT_MIN_NUMBER_OF_INSTALLMENTS = 18;
    private static final int DEFAULT_MAX_NUMBER_OF_INSTALLMENTS = 36;
    private static final int MIN_NUMBER_OF_INSTALLMENTS = 6;
    private static final int MAX_NUMBER_OF_INSTALLMENTS = 48;

    public static void main(String[] args) {
        runMyApp();
    }

    public static void runMyApp() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert loan amount: ");
        int loanAmount = scanner.nextInt();
        scanner.nextLine();
        loanAmount = validateLoanAmount(loanAmount);

        System.out.print("Please insert number of installments: ");
        int numberOfInstallments = scanner.nextInt();
        scanner.nextLine();

        numberOfInstallments = validateAndSetNumberOfInstallments(numberOfInstallments);

        BigDecimal bdInterestRate = setInterestRate(numberOfInstallments);

        BigDecimal bdSingleInstalment = calculateSingleInstalment(loanAmount, numberOfInstallments, bdInterestRate);

        System.out.println("Single instalment: "+bdSingleInstalment);

    }

    private static int validateLoanAmount(int loanAmount) {

        if (loanAmount < MIN_VALUE_OF_LOAN_AMOUNT) {
            System.out.println("Amount is too low. Default value 1000,00 was set");
            return DEFAULT_MIN_VALUE_OF_LOAN_AMOUNT;
        }
        if (loanAmount > MAX_VALUE_OF_LOAN_AMOUNT) {
            System.out.println("Amount is too big. Default value 5000,00 was set");
            return DEFAULT_MAX_VALUE_OF_LOAN_AMOUNT;
        }

        return loanAmount;
    }

    private static int validateAndSetNumberOfInstallments(int numberOfInstallments) {

        if (numberOfInstallments < MIN_NUMBER_OF_INSTALLMENTS) {
            System.out.println("Number of installments is too low. Default value 18 was set");
            return DEFAULT_MIN_NUMBER_OF_INSTALLMENTS;
        }
        if (numberOfInstallments > MAX_NUMBER_OF_INSTALLMENTS) {
            System.out.println("Number of installments is too big. Default value 36 was set");
            return DEFAULT_MAX_NUMBER_OF_INSTALLMENTS;
        }

        return numberOfInstallments;
    }

    private static BigDecimal setInterestRate(int numberOfInstallments) {

        BigDecimal bdInterestRate = BigDecimal.valueOf(1.0);

        if (numberOfInstallments >= 6 && numberOfInstallments <= 12) {
            bdInterestRate=bdInterestRate.add(BigDecimal.valueOf(0.025));
        }
        if (numberOfInstallments >= 13 && numberOfInstallments <= 24) {
            bdInterestRate=bdInterestRate.add(BigDecimal.valueOf(0.050));
        }
        if (numberOfInstallments >= 25 && numberOfInstallments <= 48) {
            bdInterestRate=bdInterestRate.add(BigDecimal.valueOf(0.100));
        }

        return bdInterestRate;
    }

    private static BigDecimal calculateSingleInstalment(int loanAmount, int numberOfInstallments, BigDecimal bdInterestRate) {

        BigDecimal bdLoanAmount = BigDecimal.valueOf(loanAmount);
        BigDecimal bdNumberOfInstallments = BigDecimal.valueOf(numberOfInstallments);

        BigDecimal bdSingleInstalment = bdLoanAmount.multiply(bdInterestRate).divide(bdNumberOfInstallments,2, RoundingMode.HALF_UP);

        return bdSingleInstalment;

    }
}
