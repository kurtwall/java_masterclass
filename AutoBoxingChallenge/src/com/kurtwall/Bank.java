package com.kurtwall;

import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
        System.out.println("Created new bank " + this.name);
    }

    public ArrayList<Branch> getBranches() {
        return this.branches;
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName().equals(name)) {
                return this.branches.get(i);
            }
        }
        return null;
    }

    public Branch addBranch(String name) {
        if (findBranch(name) == null) {
            Branch branch = new Branch(name);
            this.branches.add(branch);
            return branch;
        } else {
            System.out.println("Branch already exists");
            return null;
        }
    }
}
