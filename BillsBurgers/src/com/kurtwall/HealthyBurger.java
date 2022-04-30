package com.kurtwall;

public class HealthyBurger extends Hamburger {
    private String additional5;
    private double additional5Price;

    private String additional6;
    private double additional6Price;

    public HealthyBurger(String name, String meatType, double basePrice) {
        super(name, "Brown Rye Roll", meatType, basePrice);
    }

    public void addIngredient5(String name, double price) {
        this.additional5 = name;
        this.additional5Price = price;
        System.out.printf("Added %s for $%.2f\n", name, price);
    }

    public void addIngredient6(String name, double price) {
        this.additional6 = name;
        this.additional6Price = price;
        System.out.printf("Added %s for $%.2f\n", name, price);
    }

    @Override
    public double itemizeBurger() {
        double burgerPrice = super.itemizeBurger();

        if (this.additional5 != null) {
            burgerPrice += this.additional5Price;
        }
        if (this.additional6 != null) {
            burgerPrice += this.additional6Price;
        }

        return burgerPrice;
    }
}