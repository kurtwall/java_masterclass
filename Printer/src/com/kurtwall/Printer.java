package com.kurtwall;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        if (this.tonerLevel >= 0 && this.tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = 0;
            System.out.println("Toner level cannot be more than 100%");
        }
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void refillToner(int amount) {
        if (this.tonerLevel + amount > 100 || amount < 1) {
            System.out.println("Fill amount should be at least 1 and no more than " + (100 - this.tonerLevel));
        } else {
            this.tonerLevel += amount;
        }
    }

    public void printPages(int pages) {
        if (this.isDuplex) {
            this.pagesPrinted += (pages / 2) + (pages % 2);
        } else {
            this.pagesPrinted += pages;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
