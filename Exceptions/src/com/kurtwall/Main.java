package com.kurtwall;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println(divideCheck(60, 0));
//        System.out.println(divideTryCatch(60, 0));
//        System.out.println(divideNoCheck(60, 0));

//        System.out.println("x = " + getInt());
        System.out.println("x = " + getIntChecked());

    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
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

    private static int divideNoCheck(int x, int y) {
        return x / y;
    }

    private static int divideCheck(int x, int y) {
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
