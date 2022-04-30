package com.kurtwall;
// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] intArray = getIntegers(5);
        int[] sortedArray = sortIntegers(intArray);
        printArray(sortedArray);
    }


    public static int[] getIntegers(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[count];
        System.out.println("Enter " + count + " integers");
        for (int i = 0; i < count; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = array;
        int temp;
        int index = 0;

        while (index < sortedArray.length) {
            for (int i = 0; i < sortedArray.length - 1; i++) {
                for (int j = i; j < array.length; j++) {
                    int curVal = sortedArray[i];
                    int nextVal = sortedArray[i + 1];
                    if (curVal < nextVal) {
                        sortedArray[i] = nextVal;
                        sortedArray[i + 1] = curVal;
                    }
                }
            }
            index++;
        }
        return sortedArray;
    }

}