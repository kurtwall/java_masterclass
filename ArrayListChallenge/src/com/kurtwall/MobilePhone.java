package com.kurtwall;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println(contact.getName() + " already exists");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index < 0) {
            System.out.println(oldContact.getName() + " not found");
            return false;
        }
        this.myContacts.set(index, newContact);
        System.out.println(oldContact.getName() + " replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if (index < 0) {
            System.out.println(contact.getName() + " not found");
            return false;
        }
        this.myContacts.remove(index);
        System.out.println(contact.getName() + " deleted");
        return true;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int foundPos = findContact(name);
        if (findContact(name) >= 0) {
            return myContacts.get(foundPos);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contacts List");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ": " +
                    this.myContacts.get(i).getName() + ", " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
