package com.kurtwall;

public class HealthyBurger extends Hamburger {
    private boolean hasCheese = false;
    private boolean hasSprouts = false;

    public HealthyBurger(String name, String meatType, double basePrice) {
        super(name, "Brown Rye Roll", meatType, basePrice);
    }

    public void setHasCheese() {
        this.hasCheese = true;
        this.addExtraIngredient(0.25);
    }

    public void setHasSprouts() {
        this.hasSprouts = true;
        this.addExtraIngredient(0.25);
    }

    @Override
    public void setHasLettuce() {
        super.setHasLettuce();
    }

    @Override
    public void setHasTomato() {
        super.setHasTomato();
    }

    @Override
    public void setHasOnion() {
        super.setHasOnion();
    }

    @Override
    public void setHasPickle() {
        super.setHasPickle();
    }

    @Override
    public void describeBurger() {
        System.out.println("**********");
        System.out.println(this.getName());
        System.out.println(this.getMeatType() + " on " + this.getBunType());
        System.out.println("Lettuce: " + this.hasLettuce());
        System.out.println("Tomato: " + this.hasTomato());
        System.out.println("Onion: " + this.hasOnion());
        System.out.println("Pickle: " + this.hasPickle());
        System.out.println("Cheese: " + this.hasCheese);
        System.out.println("Sprouts: " + this.hasSprouts);
        System.out.printf("Price:  $%.2f\n", this.getBasePrice());
        System.out.printf("Extras: $%.2f\n", this.getExtrasCost());
        System.out.printf("Total:  $%.2f\n", (this.getBasePrice() + this.getExtrasCost()));

    }
}
