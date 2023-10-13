package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        int day = 6;
        printDayOfWeek(day);
    }

    public static void printDayOfWeek(int day) {
        switch(day) {
            case 0:
                System.out.println("Day is Sunday");
                break;
            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
