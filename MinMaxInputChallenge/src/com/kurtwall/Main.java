package com.kurtwall;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a value (x to exit):");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value > maxValue) { maxValue = value; }
                if (value < minValue) { minValue = value; }
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Min value = " + minValue);
        System.out.println("Max value = " + maxValue);
    }
}
