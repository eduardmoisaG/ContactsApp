package eduard.moisa.lists.arraylist.challenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {
        showOptions();
        boolean quit = false;
        while(!quit) {
            System.out.print("Enter a option: \r");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    showOptions();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    findContactByName();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void showOptions() {
        System.out.println("Options: ");
        System.out.println("0. Show options");
        System.out.println("1. Print contacts");
        System.out.println("2. Add contact");
        System.out.println("3. Remove contact");
        System.out.println("4. Update contact");
        System.out.println("5. Find contact by name");
        System.out.println("6. Quit");
    }

    public static void printContacts() {
        mobilePhone.printContacts();
    }

    public static void addContact() {
        System.out.print("Please enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter contact phone number: ");
        String phoneNumber = scanner.nextLine();
        mobilePhone.addContact(name, phoneNumber);
    }

    public static void removeContact() {
        System.out.print("Please enter the name of contact you want to delete: ");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }

    public static void updateContact() {
        System.out.print("Please enter the name of contact you want to be updated: ");
        String name = scanner.nextLine();
        System.out.print("Please enter the new name: ");
        String newName = scanner.nextLine();
        System.out.print("Please enter the new phone number: ");
        String phoneNumber = scanner.nextLine();
        if(mobilePhone.findContact(newName) == -1) {
            mobilePhone.updateContact(name, newName, phoneNumber);
        } else {
            System.out.printf("A contact with name %s already exists\n", newName);
        }
    }

    public static void findContactByName() {
        System.out.println("Please enter the name of contact you want to search");
        String name = scanner.nextLine();
        int find = mobilePhone.findContact(name);
        if (find != -1) {
            System.out.println("Contact exists");
        } else {
            System.out.println("Contact do not exist");
        }
    }
}
