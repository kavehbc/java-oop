package S12_bank_account;

public class BankAccount {

    private static int lastAccountNumber = 100000;
    private int accountNumber;
    private double balance;
    private Customer accountHolder;

    public BankAccount(Customer accountHolder) {
        this.accountNumber = lastAccountNumber++;
        this.balance = 0.0;
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}