package com.kurtwall;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setFirstName("");
        p1.setLastName("");
        p1.setAge(10);
        System.out.println("fullName= " + p1.getFullName());
        System.out.println("isTeen= " + p1.isTeen());

        p1.setFirstName("John");
        p1.setAge(18);
        System.out.println("fullName= " + p1.getFullName());
        System.out.println("isTeen= " + p1.isTeen());
        p1.setLastName("Smith");
        System.out.println("fullName= " + p1.getFullName());

        Person p2 = new Person();
        p2.setLastName("Jones");
        System.out.println("fullName= " + p2.getFullName());

        Person p3 = new Person();
        p3.setFirstName("Jim");
        System.out.println("fullName= " + p3.getFullName());
    }
}
