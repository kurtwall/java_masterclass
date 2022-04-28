package com.kurtwall;

public class Hamburger {
    private String name;
    private String bunType;
    private String meatType;
    private boolean hasLettuce = false;
    private boolean hasTomato = false;
    private boolean hasOnion = false;
    private boolean hasPickle = false;
    private double basePrice = 0;
    private int extrasCount = 0;
    private double extrasCost = 0;

    public Hamburger(String name, String bunType, String meatType, double basePrice) {
        this.name = name;
        this.bunType = bunType;
        this.meatType = meatType;
        this.basePrice = basePrice;
    }

    public void setHasLettuce() {
        this.hasLettuce = true;
        this.addExtraIngredient(0.25);
    }

    public void setHasTomato() {
        this.hasTomato = true;
        this.addExtraIngredient(0.25);
    }

    public void setHasOnion() {
        this.hasOnion = true;
        this.addExtraIngredient(0.25);
    }

    public void setHasPickle() {
        this.hasPickle = true;
        this.addExtraIngredient(0.25);
    }

    public void addExtraIngredient(double amount) {
        this.extrasCost += amount;
        this.extrasCount++;
    }

    public String getName() {
        return name;
    }

    public String getBunType() {
        return bunType;
    }

    public String getMeatType() {
        return meatType;
    }

    public boolean hasLettuce() {
        return hasLettuce;
    }

    public boolean hasTomato() {
        return hasTomato;
    }

    public boolean hasOnion() {
        return hasOnion;
    }

    public boolean hasPickle() {
        return hasPickle;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getExtrasCount() {
        return extrasCount;
    }

    public double getExtrasCost() {
        return extrasCost;
    }

    public void describeBurger() {
        System.out.println("**********");
        System.out.println(this.name);
        System.out.println(this.meatType + " on " + this.bunType);
        System.out.println("Lettuce: " + this.hasLettuce);
        System.out.println("Tomato: " + this.hasTomato);
        System.out.println("Onion: " + this.hasOnion);
        System.out.println("Pickle: " + this.hasPickle);
        System.out.printf("Price:  $%.2f\n", this.basePrice);
        System.out.printf("Extras: $%.2f\n", this.extrasCost);
        System.out.printf("Total:  $%.2f\n", (this.basePrice + this.extrasCost));
    }

}
