package com.kurtwall;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0L;
        int counter = 0;


        while(true) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                sum += input;
                counter++;
            } else {
                break;
            }
        }
        scanner.close();

        if (counter > 0) {
            avg = Math.round(sum / (double) counter);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
