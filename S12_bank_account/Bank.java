package S12_bank_account;

public class Bank {
    public static void main(String[] args) {
        System.out.println("Bank Account Example");

        // Create a customer
        Customer customer = new Customer("Alice", 30, "Female", 1.65, 55.0);

        // Create a bank account for the customer
        BankAccount account = new BankAccount(customer);
    }
