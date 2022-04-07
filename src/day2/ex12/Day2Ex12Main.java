package day2.ex12;

public class Day2Ex12Main {

    private final static int LOWER_BOUND_OF_ASCII = 97;
    private final static int UPPER_BOUND_OF_ASCII = 122;

    public static void main(String[] args) {
        int shift = 27;
        if(shift>=0){
            System.out.println(encryptText("bardzo lubie programowac",shift));
        }else{
            System.out.println("Shift must be greater than 0");
        }
    }

    private static String encryptText(String text, int shift) {

        String inputText = text.replaceAll(" ", "").toLowerCase();
        StringBuilder sb = new StringBuilder();
        if (!isLoopInAsciiTable(shift)) {
            for (int i = 0; i < inputText.length(); i++) {
                char s = inputText.charAt(i);
                int charAfterRotor=cryptographicRotor(shift,s);
                sb.append((char) charAfterRotor);
            }
            return sb.toString();
        }
        return "cryptography error, you must set a different shift";
    }

    private static int cryptographicRotor(int shift, int startPosition) {

        int length = Day2Ex12Main.UPPER_BOUND_OF_ASCII - Day2Ex12Main.LOWER_BOUND_OF_ASCII + 1;
        if (shift > Day2Ex12Main.UPPER_BOUND_OF_ASCII - startPosition) {
            shift = shift % length;
        }
        if (shift == 0) {
            return startPosition;
        }
        if (startPosition < LOWER_BOUND_OF_ASCII || startPosition > UPPER_BOUND_OF_ASCII) {
            return 0;
        }
        if (shift <= UPPER_BOUND_OF_ASCII - startPosition) {
            return startPosition + shift;
        }
        if (shift > UPPER_BOUND_OF_ASCII - startPosition) {
            return (LOWER_BOUND_OF_ASCII - 1) + (shift - (UPPER_BOUND_OF_ASCII - startPosition));
        }
        return startPosition;
    }

    private static boolean isLoopInAsciiTable(int shift) {
        return shift % (UPPER_BOUND_OF_ASCII - LOWER_BOUND_OF_ASCII + 1) == 0;
    }
}
