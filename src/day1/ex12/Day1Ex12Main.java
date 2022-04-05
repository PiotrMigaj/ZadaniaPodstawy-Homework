package day1.ex12;

public class Day1Ex12Main {
    public static void main(String[] args) {

//        int divident = 7;
//        int divider = 30;
//
//        runMyApp(divident,divider);
//
//        divident = -7;
//        divider = 30;
//
//        runMyApp(divident,divider);
//
//        divident = 7;
//        divider = -30;
//
//        runMyApp(divident,divider);
//
//        divident = -7;
//        divider = -30;
//
//        runMyApp(divident,divider);

//        int divident = 30;
//        int divider = 7;
//
//        runMyApp(divident,divider);
//
//        divident = -30;
//        divider = 7;
//
//        runMyApp(divident,divider);
//
//        divident = 30;
//        divider = -7;
//
//        runMyApp(divident,divider);
//
//        divident = -30;
//        divider = -7;
//
//        runMyApp(divident,divider);

        //runMyApp(30,0);

        runMyApp(2,4);
        runMyApp(3,4);
        runMyApp(4,2);
        runMyApp(4,3);

        System.out.println(ifOwnModuloImplementationIsCorrect(2,4));
        System.out.println(ifOwnModuloImplementationIsCorrect(3,4));
        System.out.println(ifOwnModuloImplementationIsCorrect(4,2));
        System.out.println(ifOwnModuloImplementationIsCorrect(4,3));

        System.out.println();

        System.out.println(ifOwnModuloImplementationIsCorrect(30,7));
        System.out.println(ifOwnModuloImplementationIsCorrect(-30,7));
        System.out.println(ifOwnModuloImplementationIsCorrect(30,-7));
        System.out.println(ifOwnModuloImplementationIsCorrect(-30,-7));
        System.out.println(ifOwnModuloImplementationIsCorrect(30,0));
        System.out.println(ifOwnModuloImplementationIsCorrect(7,30));
        System.out.println(ifOwnModuloImplementationIsCorrect(-7,30));
        System.out.println(ifOwnModuloImplementationIsCorrect(7,-30));
        System.out.println(ifOwnModuloImplementationIsCorrect(-7,-30));

    }

    private static void runMyApp(int divident, int divider){

        if (divider==0){
            System.out.println("Can't divide by 0");
        }else {
            System.out.println(ownModuloImplementation(divident,divider));
        }

    }

    protected static int ownModuloImplementation(int divident, int divider){

        int tmp=divident/divider;

        if (divident-tmp==0){
            return 0;
        }

        return divident-tmp*divider;
    }

    private static boolean ifOwnModuloImplementationIsCorrect(int divident, int divider){

        if (divider ==0){
            return false;
        }

        int javaModulo = divident%divider;
        int ownModulo = ownModuloImplementation(divident,divider);

        return javaModulo==ownModulo;
    }
}
