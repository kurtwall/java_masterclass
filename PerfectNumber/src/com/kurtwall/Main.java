package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        System.out.println("isPerfectNumber(6) = " + isPerfectNumber(6));
        System.out.println("isPerfectNumber(28) = " + isPerfectNumber(28));
        System.out.println("isPerfectNumber(5) = " + isPerfectNumber(5));
        System.out.println("isPerfectNumber(-1) = " + isPerfectNumber(-1));
        System.out.println("isPerfectNumber(90) = " + isPerfectNumber(90));
    }

    public static boolean isPerfectNumber(int value) {
        if (value < 1) {
            return false;
        }

        int factor = 2;
        int sum = 1;

        while (factor <= value / 2) {
            if (value % factor == 0) {
                sum += factor;
            }
            factor++;
        }

        if (sum == value) {
            return true;
        } else {
            return false;
        }
    }
}
