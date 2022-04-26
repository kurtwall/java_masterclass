package com.kurtwall;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;
        int inputVal;
        Scanner scanner = new Scanner(System.in);

        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ": ");
            if (scanner.hasNextInt()) {
                inputVal = scanner.nextInt();
                sum += inputVal;
                counter++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum of input numbers: " + sum);
    }
}
