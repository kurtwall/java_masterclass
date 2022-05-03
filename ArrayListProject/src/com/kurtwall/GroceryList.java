package com.kurtwall;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items on your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        if (position >= 0) {
            groceryList.set(position, newItem);
            System.out.println("Item " + (position + 1) + " updated to " + newItem);
        }
    }

    public void removeGroceryItem(int itemNum) {
        if (itemNum >= 0) {
            groceryList.remove(itemNum);
            System.out.println("Item " + (itemNum + 1) + " removed");
        }
    }

    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
