package com.kurtwall;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printInstructions();
        while (!quit) {
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("0: Display this help");
        System.out.println("1: Display grocery list");
        System.out.println("2: Add grocery item");
        System.out.println("3: Modify grocery item");
        System.out.println("4: Remove grocery item");
        System.out.println("5: Search grocery list");
        System.out.println("6: Quit");
    }

    public static void addItem() {
        System.out.print("Enter new item: ");
        String item = scanner.nextLine();
        groceryList.addGroceryItem(item);
    }

    public static void modifyItem() {
        System.out.print("Enter item number to modify: ");
        int itemNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter modification: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNum - 1, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number to remove: ");
        int itemNum = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNum - 1);
    }

    public static void searchForItem() {
        System.out.print("Enter item to find: ");
        String item = scanner.nextLine();
        if (groceryList.findItem(item) != null) {
            System.out.println("Found " + item + " on grocery list");
        } else {
            System.out.println(item + " not on grocery list");
        }
    }
}