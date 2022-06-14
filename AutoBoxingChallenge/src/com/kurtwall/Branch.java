package com.kurtwall;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
        System.out.println("Created new branch " + name);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public void listCustomers(boolean withTransactions) {
        for (int i = 0; i < customers.size(); i++) {
            if (!withTransactions) {
                System.out.println((i+1) + ". " + customers.get(i).getName());
            } else {
                System.out.println((i+1) + ". " + customers.get(i).getName() + ": " + customers.get(i).getTransactions());
            }
        }
    }

    public Customer addCustomer(String name, double initialDeposit) {
        Customer exists = findCustomer(name);
        if (exists == null) {
            Customer customer = new Customer(name, initialDeposit);
            this.customers.add(customer);
            return customer;
        } else {
            System.out.println("Customer with that name already exists");
            return null;
        }
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(name)) {
                return this.customers.get(i);
            }
        }
        return null;
    }
}
