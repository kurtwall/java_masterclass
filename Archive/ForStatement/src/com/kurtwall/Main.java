package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000.0, 2.0));

        for (int i = 8; i >= 2; i--) {
            System.out.println("$10,000 at " + i + " interested = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        int primeCount = 0;
        for (int i = 1; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                primeCount++;
                if (primeCount == 3) {
                    break;
                }
            }
        }

        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by 3 and 5");
                sum += i;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("The sum of the first 5 such numbers is " + sum);
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
