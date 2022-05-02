package com.kurtwall;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 10, 6, 4};
        print(array);
        reverse(array);
        print(array);
    }

    private static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = maxIndex / 2;
        for (int i = 0; i < halfLength ; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
