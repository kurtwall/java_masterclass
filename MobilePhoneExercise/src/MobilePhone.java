import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    ArrayList<Contact> contacts;
    Scanner sc = new Scanner(System.in);

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
}
