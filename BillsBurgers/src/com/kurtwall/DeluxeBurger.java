package com.kurtwall;

public class DeluxeBurger extends Hamburger {
    private String drink;
    private boolean chips;

    public DeluxeBurger(String name, String bunType, String meatType, double basePrice, String drink, boolean chips) {
        super(name, bunType, meatType, basePrice);
        this.drink = drink;
        this.chips = chips;
    }

    @Override
    public void describeBurger() {
        System.out.println("**********");
        System.out.println(this.getName());
        System.out.println(this.getMeatType() + " on " + this.getBunType());
        System.out.printf("Price: $%.2f\n", this.getBasePrice());
        System.out.printf("Total: $%.2f\n", this.getBasePrice());
    }
}
