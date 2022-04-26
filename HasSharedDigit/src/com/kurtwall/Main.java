package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        System.out.println("hasSharedDigit(12, 13) = " + hasSharedDigit(12, 13));
        System.out.println("hasSharedDigit(12, 23) = " + hasSharedDigit(12, 23));
        System.out.println("hasSharedDigit(9, 90) = " + hasSharedDigit(9, 90));
        System.out.println("hasSharedDigit(15, 55) = " + hasSharedDigit(15, 55));
        System.out.println("hasSharedDigit(15, -10) = " + hasSharedDigit(15, -10));
    }

    public static boolean hasSharedDigit(int m, int n) {
        if (m < 10 || m > 99 || n < 10 || n > 99) {
            return false;
        }

        boolean sharedDigit = false;
        while (m > 0) {
            int mDigit = m % 10;
            int innerVal = n;
            m /= 10;
            while (innerVal > 0) {
                int nDigit = innerVal % 10;
                innerVal /= 10;
                if (mDigit == nDigit) {
                    return true;
                }
            }
        }
        return sharedDigit;
    }
}
