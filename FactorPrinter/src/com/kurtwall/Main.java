package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(-6);
        printFactors(-1);
        printFactors(100);
    }

    public static void printFactors(int value) {
        if (value < 1) {
            System.out.println("Invalid Value");
        } else {
            String factors = "1 ";
            for (int n = 2; n <= value; n++) {
                if (value % n == 0) {
                    factors += n + " ";
                }
            }
            System.out.println(factors);
        }
    }
}