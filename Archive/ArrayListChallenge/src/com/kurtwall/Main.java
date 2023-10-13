package com.kurtwall;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("867-5309");

    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        do {
            printInstructions();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    printInstructions();
                    break;
                default:
                    System.out.println("Unrecognized choice: " + choice);
                    break;
            }
        } while (quit == false);
    }

    private static void printInstructions() {
        System.out.println("0: Quit");
        System.out.println("1: List Contacts");
        System.out.println("2: Add Contact");
        System.out.println("3: Update Contact");
        System.out.println("4: Remove Contact");
        System.out.println("5: Find Contact");
        System.out.println("6: Show these options");
        System.out.print("\nEnter choice: ");
    }

    private static void addContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact number: ");
        String number = scanner.nextLine();
        Contact contact = Contact.createContact(name, number);

        if (mobilePhone.addNewContact(contact))  {
            System.out.println("Created new contact: " + contact.getName());
        } else {
            System.out.println("Failed to create new contact");
        }
    };

    private static void updateContact() {
        System.out.print("Enter contact name: ");
        String oldName = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(oldName);
        if (oldContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(oldContact,newContact)) {
            System.out.println("Successfully updated contact");
        } else {
            System.out.println("Failed to update contact");
        }
    };

    private static void deleteContact() {
        System.out.print("Enter contact name: ");
        String oldName = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(oldName);
        if (oldContact == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(oldContact)){
            System.out.println("Successfully deleted contact");
        } else {
            System.out.println("Failed to remove contact");
        }
    };

    private static void findContact() {
        System.out.print("Enter contact name: ");
        String oldName = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(oldName);
        if (oldContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + oldContact.getName() + " has number " + oldContact.getPhoneNumber());
    };
}
