package com.collegelassale.contact;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactDB contactDB = new ContactDB();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (exit == false) {
            // Terminal.clear();

            System.out.println("*********************");
            System.out.println("Contact Application");
            System.out.println("*********************");
            // user inputs:
            // 1. add a contact
            // 2. view contacts
            // 3. delete a contact
            // 4. search a contact
            // 0. exit

            // showing the options to select
            int totalOptions = 4;
            System.out.println("1. Add a contact");
            System.out.println("2. View contacts");
            System.out.println("3. Delete a contact");
            System.out.println("4. Search a contact");
            System.out.println("0. Exit");
            System.out.println();

            int choice = 0;
            boolean validChoice = false;
            while (!validChoice) {
                System.out.print("Enter your choice: ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    if (choice <= totalOptions && choice >= 0) {
                        validChoice = true;
                    } else {
                        System.out.println("Invalid choice.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // Clear the invalid input
                }
            }

            switch (choice) {
                case 1:
                    // contactDB = addContact(contactDB);
                    System.out.print("Enter contact name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.print("Enter contact phone number: ");
                    String phoneNumber = scanner.nextLine();
                    // Add contact to the database
                    contactDB.addContact(name, phoneNumber);
                    System.out.println("Contact added: " + name + " - " + phoneNumber);
                    break;
                case 2:
                    viewContacts(contactDB);
                    break;
                case 3:
                    System.out.print("Enter a contact name to delete: ");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    // Add contact to the database
                    contactDB.deleteContact(name);
                    System.out.println("Contact deleted: " + name);
                    break;
                case 4:
                    System.out.print("Enter a contact name to search: ");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    String number = contactDB.getContact(name);
                    if (number != null) {
                        System.out.println("Contact found: " + name + " - " + number);
                    } else {
                        System.out.println("Contact not found: " + name);
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        }
        scanner.close();
    }

    public static void viewContacts(ContactDB contactDB) {
        System.out.println("Contacts:");
        for (String name : contactDB.getAllContacts().keySet()) {
            String phoneNumber = contactDB.getContact(name);
            System.out.println(name + " - " + phoneNumber);
        }
    }
}