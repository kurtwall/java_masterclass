package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic Burger", "White Roll", "Beef", 1.50);
        hamburger.setHasLettuce();
        hamburger.setHasOnion();
        hamburger.setHasPickle();
        hamburger.setHasTomato();
        hamburger.describeBurger();

        HealthyBurger healthyBurger = new HealthyBurger("Healthy Burger", "Turkey", 2.00);
        healthyBurger.setHasLettuce();
        healthyBurger.setHasOnion();
        healthyBurger.setHasPickle();
        healthyBurger.setHasTomato();
        healthyBurger.setHasCheese();
        healthyBurger.setHasSprouts();
        healthyBurger.describeBurger();

        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe Burger", "Wheat Roll", "Elk", 4.00, "Soda", true);
        deluxeBurger.describeBurger();
    }
}
