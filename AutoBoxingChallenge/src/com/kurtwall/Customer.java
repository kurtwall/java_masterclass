package com.kurtwall;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialDeposit) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.addTransaction(initialDeposit);
        System.out.println("Added new customer " + name);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
        System.out.println("Added new transaction for " + this.name);
    }
}
