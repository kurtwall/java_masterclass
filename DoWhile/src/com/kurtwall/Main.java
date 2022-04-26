package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        int number = 2;
        int end = 21;
        int sum = 0;
        while (number <= end) {
            if (isEvenNumber(number)) {
                System.out.println(number + " is an even number");
                sum += number;
            }
            number++;
        }
        System.out.println("Sum = " + sum);
    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
