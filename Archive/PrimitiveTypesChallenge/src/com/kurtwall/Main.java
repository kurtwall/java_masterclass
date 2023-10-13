package com.kurtwall;

public class Main {

    public static void main(String[] args) {
	Byte b = 5;
    Short sh = 128;
    int i = 10000;

    long l = 50000L + 10 * (b + sh + i);
    System.out.println(l);
    }
}
