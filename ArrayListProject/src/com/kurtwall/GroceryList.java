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

    public void modifyGroceryItem(String searchItem, String newItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        if (position >= 0) {
            groceryList.set(position, newItem);
            System.out.println("Item " + (position + 1) + " updated to " + newItem);
        }
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        if (position >= 0) {
            groceryList.remove(position);
            System.out.println("Item " + (position + 1) + " removed");
        }
    }

    public boolean onList(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
}
