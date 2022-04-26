package com.kurtwall;

public class Kia extends Car {
    private int roadServiceMonths;

    public Kia(int roadServiceMonths) {
        super("Kia", "AWD", 5, 5, 4, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = this.getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            this.stop();
            this.changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            this.changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            this.changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            this.changeGear(3);
        } else {
            this.changeGear(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
