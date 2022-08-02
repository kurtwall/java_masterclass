import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Demonstrate using the LinkedList class
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Currently visiting " + i.next());
        }
        System.out.println("=============================");
    }

    private static Boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> li = linkedList.listIterator();
        while (li.hasNext()) {
            String city = li.next();
            if (city.compareTo(newCity) == 0) {
                // City already in list
                System.out.println(newCity + " already a destination");
                return false;
            } else if (city.compareTo(newCity) > 0) {

        }
    }
}
