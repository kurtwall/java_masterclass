package com.kurtwall;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Bank of Kurt");
        Branch downtownBranch = bank.addBranch("Downtown Branch");
        Branch mallBranch = bank.addBranch("Mall Branch");

        Customer joebob = downtownBranch.addCustomer("Joe Bob", 1000.00);
        joebob.addTransaction(200.00);
        joebob.addTransaction(1500.00);
        joebob.addTransaction(100.00);
        joebob.addTransaction(-60.00);
        joebob.addTransaction(-50.00);
        joebob.addTransaction(-40.00);

        Customer marysue = downtownBranch.addCustomer("Mary Sue", 500.00);
        marysue.addTransaction(300.00);
        marysue.addTransaction(-10.00);
        marysue.addTransaction(-20.00);
        marysue.addTransaction(-30.00);

        Customer junior = mallBranch.addCustomer("Junior", 100.00);
        junior.addTransaction(100.00);
        junior.addTransaction(10000.00);
        junior.addTransaction(-500.00);
        junior.addTransaction(-500.00);

        downtownBranch.listCustomers(true);
        mallBranch.listCustomers(true);
    }
}
