package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        Double totalCentimeters = calcFeetAndInchesToCentimeters(12.0d);
        System.out.println(totalCentimeters);

        totalCentimeters = calcFeetAndInchesToCentimeters(6.0d);
        System.out.println(totalCentimeters);

        totalCentimeters = calcFeetAndInchesToCentimeters(2.0d, 2.0d);
        System.out.println(totalCentimeters);
    }

    public static Double calcFeetAndInchesToCentimeters(Double feet, Double inches) {
        if (feet < 0) {
            return -1.0d;
        }
        if (inches < 0 || inches > 12) {
            return -1.0d;
        }
        return ((feet * 12) + inches) * 2.54d;
    }

    public static Double calcFeetAndInchesToCentimeters(Double inches) {
        if (inches < 0) {
            return -1.0d;
        }
        Double totalFeet = inches / 12.0d;
        return calcFeetAndInchesToCentimeters(totalFeet, 0.0d);
    }
}
