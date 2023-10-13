package com.kurtwall;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Specifically, it was " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
        }

        char charValue = 'F';
        switch (charValue) {
            case 'A':
                System.out.println("Value was 'A'");
                break;
            case 'B':
                System.out.println("Value was 'B'");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Value was 'C','D', or 'E'");
                break;
            default:
                System.out.println("Value was neither A, B, C, D, nor E.");
        }

        String month = "APRIL";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Value was JANUARY");
                break;
            case "february":
            case "march":
                System.out.println(month + " was February or March");
                break;
            default:
                System.out.println("Nothing expected was found");
        }
    }
}
