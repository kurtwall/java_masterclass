import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    ArrayList<Contact> contacts;
    Scanner sc = new Scanner(System.in);

    public void printInstructions() {
        System.out.println("0: Show contacts");
        System.out.println("1: Add contact");
        System.out.println("2: Edit contact");
        System.out.println("3: Delete contact");
        System.out.println("4: Find contact");
        System.out.println("5: Quit");
    }

    public void addContact() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter number: ");
        String number = sc.nextLine();
        sc.nextLine();

        Contact newContact = new Contact(name, number);
        contacts.add(newContact);
    }

    public void removeContact() {
        System.out.print("Enter name to removeL ");
        String name = sc.nextLine();
        int position = contacts.indexOf(name);
        if (position >= 0) {
            contacts.remove(position);
        } else {
            System.out.println("Contact " + name + " not found");
        }
    }

    public void updateContact() {

    }

    public void printContactList() {

    }

    public ArrayList<Contact> getContactList() {
        return contacts;
    }

    public Contact findContact(String name) {
        if (contacts.contains(name)) {
            int i = contacts.indexOf(name);
            return contacts.get(i);
        } else {
            return null;
        }
    }
}
