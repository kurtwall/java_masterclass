package com.kurtwall;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Elk", 19.10, "Ciabatta");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("Soda", 0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add ingredients to the Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add ingredients to the Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add ingredients to the Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add ingredients to the Deluxe Burger");
    }
}
