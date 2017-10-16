package com.Krystiano;

import java.util.ArrayList;
import java.util.Scanner;

public class Mobile {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Contact> contactList = new ArrayList<>();


    public Mobile() {
        System.out.println("Hello!");
        startApp();
    }

    public void startApp() {
        int quit = 0;
        while (quit != 6) {
            System.out.println("\n1. Add new contact\n");
            System.out.println("2. Print contact list\n");
            System.out.println("3. Remove contact\n");
            System.out.println("4. Clear contact list\n");
            System.out.println("5. Modify contact\n");
            System.out.println("6. Quit\n");
            quit = scanner.nextInt();
            scanner.nextLine();
            switch (quit) {
                case 1:
                    addContact();
                    break;
                case 2:
                    printContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    clearContacts();
                    break;
                case 5:
                    modifyContact();
                    break;
                case 6:
                    quit = 6;
                    break;
                default:
                    System.out.println("No option selected\n");
                    quit = 0;
                    break;
            }
        }

    }

    private void addContact() {
        System.out.println("Type name:");
        String name = scanner.nextLine();
        System.out.println("Type number:");
        int number = scanner.nextInt();
        scanner.nextLine();
        contactList.add(new Contact(name, number));
    }

    private void printContact() {
        if (contactList.size() != 0) {
            System.out.println("\nContacts list:");
            for (int i = 0; i < contactList.size(); i++) {
                System.out.println("Contact " + (i + 1) + ". " + contactList.get(i).printContact());
            }
        } else {
            System.out.println("No contacts on mobile :(");
        }
    }

    private void removeContact() {
        printContact();
        System.out.println("Which contact do you want to remove?\n Type name");
        String deletedName = scanner.nextLine();
        int indexDeletedName = onList(deletedName);
        if (indexDeletedName >= 0)
            contactList.remove(indexDeletedName);
        System.out.println("Contact succesfully deleted.\n");
    }

    private int onList(String searchedName) {
        int index = -1;
        if (contactList.size() != 0) {
            for (int i = 0; i < contactList.size(); i++) {
                String contactName = contactList.get(i).getName();
                contactName = contactName.toLowerCase();
                searchedName = searchedName.toLowerCase();
                if (searchedName.equals(contactName)) {
                    index = i;
                    System.out.println("Contact found on position " + (index + 1) + ".");
                }
            }
        } else {
            System.out.println("No contact on mobile\n");
        }
        if (index == -1)
            System.out.println("No contacts on mobile\n1");
        return index;
    }

    private void clearContacts() {
        System.out.println("Are u sure? Y/N");
        String answer = scanner.nextLine();
        answer=answer.toLowerCase();
        if (answer.equals("y")) {
            contactList.clear();
            System.out.println("Contact list is blank.");
        } else {
            System.out.println("Action dismissed.");
        }
    }

    private void modifyContact(){
        printContact();
        System.out.println("\nWhich contact do you want to modify?\n Type name");
        String modifyName = scanner.nextLine();
        int modifyIndex = onList(modifyName);
        modifyContact(modifyIndex);
    }
    private void modifyContact(int index){
        contactList.get(index).modifyContact();
    }

}