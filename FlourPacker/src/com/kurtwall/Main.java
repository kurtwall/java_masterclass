package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        System.out.println("canPack(1, 0, 4) = " + canPack(1, 0, 4));
        System.out.println("canPack(1, 0, 5) = " + canPack(1, 0, 5));
        System.out.println("canPack(0, 5, 4) = " + canPack(0, 5, 4));
        System.out.println("canPack(2, 2, 11) = " + canPack(2, 2, 11));
        System.out.println("canPack(-3, 2, 12) = " + canPack(-3, 2, 12));
        System.out.println("canPack(2, 1, 5) = " + canPack(2, 1, 5));
        System.out.println("canPack(5, 3, 24) = " + canPack(5, 3, 24));
        System.out.println("canPack(1, 0, 6) = " + canPack(1, 0, 6));
        System.out.println("canPack(4, 18, 19) = " + canPack(4, 18, 19));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        // Supply must be greater than demand
        if (bigCount * 5 + smallCount < goal) {
            return false;
        }
        // Regardless of bigCount, remainder of goal has to be less than smallCount
        if (goal % 5 <= smallCount) {
            return true;
        } else {
            return false;
        }
    }
}