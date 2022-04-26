package com.kurtwall;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double d) {
        this.firstNumber = d;
    }

    public void setSecondNumber(double d) {
        this.secondNumber = d;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtrationResult() {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {
        if (this.secondNumber == 0)  {
            return 0;
        } else {
            return this.firstNumber / this.secondNumber;
        }
    }
}
