import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GroceryList list = new GroceryList();
    }
}
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items on your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery list item " + position + " modified");
    }

    public void removeGroceryItem(int postition) {
        String theItem = groceryList.get(postition);
        groceryList.remove(postition);
        System.out.println(theItem + " removed from list");
    }

    public void String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        } else {
            return null;
        }
    }
}
