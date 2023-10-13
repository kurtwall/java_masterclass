package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        Double pounds = 193.0d;
        Double ratio = 0.45359237d;
        Double kilos;

        kilos = pounds * ratio;

        System.out.println(pounds + " pounds = " + kilos + " kilos");
    }
}
