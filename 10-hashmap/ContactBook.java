import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class ContactBook {

    private ArrayList<HashMap<String, String>> contacts;

    public ContactBook() {
        // constructor
        this.contacts = new ArrayList<>();
    }

    public void addContact(String name, String phone, String email) {
        HashMap<String, String> entry = new HashMap<>();
        entry.put("name", name);
        entry.put("phone", phone);
        entry.put("email", email);
        this.contacts.add(entry);
    }

    public static void main(String[] args) {
        System.out.println("Contact Book");
        System.out.println("*****************");
        ContactBook book = new ContactBook();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean validChoice = false;
        boolean exit = false;

        while (!exit) {
            choice = 0;
            validChoice = false;
            while (!validChoice) {
                System.out.println();
                System.out.println("MAIN MENU");
                System.out.println("*****************");
                System.out.println("1. Add Contact");
                System.out.println("2. Search Contacts");
                System.out.println("3. Delete Contact");
                System.out.println("4. List Contacts");

                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    if (choice <= 5) {
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
                    // Add Contact
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter phone: ");
                    String phone = scanner.next();
                    System.out.print("Enter email: ");
                    String email = scanner.next();
                    book.addContact(name, phone, email);
                    break;
                case 2:
                    // Search Contacts
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.next();
                    for (HashMap<String, String> contact : book.contacts) {
                        if (contact.get("name").equalsIgnoreCase(searchName)) {
                            System.out.println("Found: " + contact.get("name") + ", Phone: " + contact.get("phone")
                                    + ", Email: " + contact.get("email"));
                        }
                    }
                    break;
                case 3:
                    // Delete Contact
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.next();
                    book.contacts.removeIf(contact -> contact.get("name").equalsIgnoreCase(deleteName));
                    break;
                case 4:
                    // List Contacts
                    for (HashMap<String, String> contact : book.contacts) {
                        System.out.println("Name: " + contact.get("name") + ", Phone: " + contact.get("phone")
                                + ", Email: " + contact.get("email"));
                    }
                    break;
                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    break;
            }
        }
        scanner.close();

    }
}
