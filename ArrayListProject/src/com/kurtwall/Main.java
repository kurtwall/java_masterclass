package com.kurtwall;

import java.util.InputMismatchException;
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
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                continue;
            }
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
        System.out.print("Enter item to modify: ");
        String item = scanner.nextLine();
        System.out.print("Enter modification: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(item, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item to remove: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.print("Enter item to find: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onList(searchItem)) {
            System.out.println(searchItem + " not on grocery list");
        } else {
            System.out.println("Found " + searchItem + " on grocery list");
        }
    }
}