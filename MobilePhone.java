package eduard.moisa.lists.arraylist.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    /*
System.out.println("Options: ");
        System.out.println("0. Show options");
        System.out.println("1. Print contacts");
        System.out.println("2. Add contact");
        System.out.println("3. Remove contact");
        System.out.println("4. Update contact");
        System.out.println("5. Find contact by name");

        */
        public void printContacts() {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.printf("%d. Name: %s  Phone Number: %s\n", i + 1, contacts.get(i).getName(), contacts.get(i).getPhoneNumber());
            }
        }

        public void addContact(String name, String phoneNumber) {
            int index = findContact(name);
            if (index == -1) {
                contacts.add(new Contact(name, phoneNumber));
                System.out.printf("Contact with name %s and phone number %s has been added\n", name, phoneNumber);
            } else {
                System.out.printf("Contact with name %s already exist\n", name);
            }
        }

        public void removeContact(String name) {
            int index = findContact(name);
            if(index != -1) {
                contacts.remove(index);
                System.out.printf("Removed contact with name %s\n", name);
            } else {
                System.out.printf("No contact with name %s exists\n", name);
            }
        }

        public void updateContact(String name, String newName, String newPhoneNumber) {
            int index = findContact(name);
            if(index != -1) {
                contacts.set(index, new Contact(newName, newPhoneNumber));
                System.out.printf("Contact with name %s has been updated\n", name);
            }
        }

        public int findContact(String name) {
            for (Contact c: contacts) {
                if (c.getName().equals(name)) return contacts.indexOf(c);
            }
            return -1;
        }
}
