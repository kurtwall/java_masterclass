package com.kurtwall;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String name, String bunType, String meatType, double basePrice) {
        super(name, bunType, meatType, basePrice);
        super.addIngredient1("Chips", 0.75);
        super.addIngredient2("Soda", 1.00);
    }

    @Override
    public void addIngredient1(String name, double price) {
        System.out.println("Cannot add ingredients to the Deluxe Burger");
    }

    @Override
    public void addIngredient2(String name, double price) {
        System.out.println("Cannot add ingredients to the Deluxe Burger");
    }

    @Override
    public void addIngredient3(String name, double price) {
        System.out.println("Cannot add ingredients to the Deluxe Burger");
    }

    @Override
    public void addIngredient4(String name, double price) {
        System.out.println("Cannot add ingredients to the Deluxe Burger");
    }
}
