package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        System.out.println("hasSameLastDigit(41, 22, 71) = " + hasSameLastDigit(41, 22, 71));
        System.out.println("hasSameLastDigit(23, 32, 42) = " + hasSameLastDigit(23, 32, 42));
        System.out.println("hasSameLastDigit(9, 99, 999) = " + hasSameLastDigit(9, 99, 999));
        System.out.println("hasSameLastDigit(37, 92, 107) = " + hasSameLastDigit(23, 32, 42));
    }

    public static boolean isValid(int n) {
        if (n < 10 || n > 1000) {
            return false;
        }
        return true;
    }

    public static boolean hasSameLastDigit(int m, int n, int o) {
        if (!isValid(m) || !isValid(n) || !isValid(o)) {
            return false;
        }

        int mDigit = m % 10;
        int nDigit = n % 10;
        int oDigit = o % 10;
        if (mDigit == nDigit || mDigit == oDigit || nDigit == oDigit) {
            return true;
        }
        return false;
    }
}
