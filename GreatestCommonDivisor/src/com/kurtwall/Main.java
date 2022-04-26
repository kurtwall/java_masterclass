package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        System.out.println("greatestCommonDivisor(12, 30) = " + getGreatestCommonDivisor(12, 30));
        System.out.println("greatestCommonDivisor(1, 10) = " + getGreatestCommonDivisor(1, 10));
        System.out.println("greatestCommonDivisor(11, 10) = " + getGreatestCommonDivisor(11, 10));
        System.out.println("greatestCommonDivisor(50, 100) = " + getGreatestCommonDivisor(50, 100));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int gcd = 1;
        for (int n = 1; n <= first; n ++) {
            if (first % n == 0 && second % n == 0) {
                gcd = n;
            }
        }
        return gcd;
    }
}
