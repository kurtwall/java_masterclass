import java.util.*;

/**
 * Demonstrate using the LinkedList class
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit, "Portland");
        addInOrder(placesToVisit, "Eugene");
        addInOrder(placesToVisit, "Bend");
        addInOrder(placesToVisit, "Ashland");
        addInOrder(placesToVisit, "Corvalis");
        addInOrder(placesToVisit, "Gaston");
        addInOrder(placesToVisit, "Hood River");

        printList(placesToVisit);

        if (false) {
            addInOrder(placesToVisit, "Junction City");
            printList(placesToVisit);

            placesToVisit.remove(4);
            printList(placesToVisit);
        }

        if (true) {
            visitCities(placesToVisit);
        }
    }

    private static void printList(LinkedList<String> linkedList) {
        ListIterator<String> i = linkedList.listIterator();

        while (i.hasNext()) {
            System.out.println("Currently visiting " + i.next());
        }
        System.out.println("=============================");
    }

    private static Boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> li = linkedList.listIterator();

        while (li.hasNext()) {
            String city = li.next();
            int result = city.compareTo(newCity);
            if (result == 0) {
                System.out.println(newCity + " already a destination");
                return false;
            } else if (result > 0) {
                // Goes before the "current" city
                li.previous();
                li.add(newCity);
                return true;
            } else if (result < 0) {
                // Go to next list item
            }
        }
        linkedList.add(newCity);
        return true;
    }

    private static void visitCities(LinkedList<String> cities) {
        ListIterator<String> li = cities.listIterator();
        Boolean forward = true;

        printMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        while (choice != 0) {
            switch (choice) {
                case 1: // forward
                    if (!forward) {
                        if (li.hasNext()) {
                            li.next();
                        }
                        forward = true;
                    }
                    if (li.hasNext()) {
                        System.out.println("Now visiting " + li.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        forward = false;
                    }
                    break;

                case 2: // back
                    if (forward) {
                        if (li.hasPrevious()) {
                            li.previous();
                        }
                        forward = false;
                    }
                    if (li.hasPrevious()) {
                        System.out.println("Now visiting " + li.previous());
                    } else {
                        System.out.println("Reached the beginning of the list");
                        forward = true;
                    }
                    break;

                case 3: // menu
                    break;
            }
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }

    private static void printMenu() {
        System.out.println("\n1) Visit next city\n" +
                "2) Visit previous city\n" +
                "3) Print menu options\n" +
                "0) End visit (exit)");
        System.out.print("Select action: ");
    }
}