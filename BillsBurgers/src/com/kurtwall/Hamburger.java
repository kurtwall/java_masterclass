package com.kurtwall;

public class Hamburger {
    private String name;
    private String bunType;
    private String meatType;
    private double basePrice;

    private String additional1;
    private double additional1Price;

    private String additional2;
    private double additional2Price;

    private String additional3;
    private double additional3Price;

    private String additional4;
    private double additional4Price;

    public Hamburger(String name, String bunType, String meatType, double basePrice) {
        this.name = name;
        this.bunType = bunType;
        this.meatType = meatType;
        this.basePrice = basePrice;
        System.out.printf("%s: %s on %s\n", this.name, this.meatType, this.bunType);
    }

    public void addIngredient1(String name, double price) {
        this.additional1 = name;
        this.additional1Price = price;
        System.out.printf("Added %s for $%.2f\n", name, price);
    }

    public void addIngredient2(String name, double price) {
        this.additional2 = name;
        this.additional2Price = price;
        System.out.printf("Added %s for $%.2f\n", name, price);
    }

    public void addIngredient3(String name, double price) {
        this.additional3 = name;
        this.additional3Price = price;
        System.out.printf("Added %s for $%.2f\n", name, price);
    }

    public void addIngredient4(String name, double price) {
        this.additional4 = name;
        this.additional4Price = price;
        System.out.printf("Added %s for $%.2f\n", name, price);
    }

    public double itemizeBurger() {
        double addonsPrice = 0;
        if (this.additional1 != null) {
            addonsPrice += this.additional1Price;
        }
        if (this.additional2 != null) {
            addonsPrice += this.additional2Price;
        }
        if (this.additional3 != null) {
            addonsPrice += this.additional3Price;
        }
        if (this.additional4 != null) {
            addonsPrice += this.additional4Price;
        }
        return this.basePrice + addonsPrice;
    }
}
