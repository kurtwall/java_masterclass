package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(75, 100, false);
        System.out.println("Pages printed: " + printer.getPagesPrinted());
        printer.printPages(10);
        System.out.println("Pages printed: " + printer.getPagesPrinted());

        System.out.println("Toner level: " + printer.getTonerLevel());
        printer.refillToner(50);
        printer.refillToner(25);
        System.out.println("Toner level: " + printer.getTonerLevel());

    }
}
