package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        int value = 10000;

        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Max Integer value: " + maxInt);
        System.out.println("Min Integer value: " + minInt);
        System.out.println("Blown max integer: " + (maxInt + 1));
        System.out.println("Blown min integer: " + (minInt - 1));

        int maxIntTest = 2_147_483_647;
        System.out.println(maxIntTest);

        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        System.out.println("Max Byte value: " + maxByte);
        System.out.println("Min Byte value: " + minByte);

        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        System.out.println("Max Short value: " + maxShort);
        System.out.println("Min Short value: " + minShort);

        long longInt = 100L;
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println("Max Long value: " + maxLong);
        System.out.println("Min Long value: " + minLong);
    }
}
