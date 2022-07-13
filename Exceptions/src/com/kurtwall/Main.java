package com.kurtwall;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println(divideChecked(60, 0));
//        System.out.println(divideTryCatch(60, 0));
//        System.out.println(divideUnchecked(60, 0));

//        System.out.println("x = " + getInt());
//        System.out.println("x = " + getIntChecked());
        System.out.println("x = " + getIntTryCatch());
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    private static int getIntTryCatch() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Caught: " + e);
            return 0;
        }
    }

    private static int getIntChecked() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        String input = s.next();
        boolean isValid = true;
        for (Integer i = 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int divideUnchecked(int x, int y) {
        return x / y;
    }

    private static int divideChecked(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideTryCatch(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
