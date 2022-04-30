package com.kurtwall;

import jdk.jshell.execution.JdiExecutionControl;

public class Main {

    public static void main(String[] args) {
        System.out.println("**********");
        Hamburger hamburger = new Hamburger("Basic Burger", "White Roll", "Beef", 2.00);
        hamburger.addIngredient1("Cheese", 0.50);
        hamburger.addIngredient2("Lettuce", 0.25);
        hamburger.addIngredient3("Tomato", 0.75);
        hamburger.addIngredient4("Pickle", 0.25);
        System.out.printf("Total Basic Burger price = $%.2f\n", hamburger.itemizeBurger());

        System.out.println("**********");
        HealthyBurger healthyBurger = new HealthyBurger("Healthy Burger", "Turkey", 2.00);
        healthyBurger.addIngredient1("Cheese", 0.50);
        healthyBurger.addIngredient2("Lettuce", 0.25);
        healthyBurger.addIngredient3("Tomato", 0.75);
        healthyBurger.addIngredient4("Pickle", 0.25);
        healthyBurger.addIngredient5("Avocado", 1.00);
        healthyBurger.addIngredient6("Sprouts", 0.25);
        System.out.printf("Total Healthy Burger price = $%.2f\n", healthyBurger.itemizeBurger());

        System.out.println("**********");
        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe Burger", "Wheat Roll", "Elk", 5.00);
        deluxeBurger.addIngredient1("Lentils", 0.50);
        System.out.printf("Total Deluxe Burger price = $%.2f\n", deluxeBurger.itemizeBurger());
    }
}
