// Title: BankAccount Class Program
// Description: Demonstrates deposit, withdraw, and balance checking
//              with proper validation and messages.

class BankAccount {

    // Private field to store the balance
    private double balance;

    // Constructor to initialize account with starting balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds! Withdrawal failed.");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

public class BankAccountTest {
    public static void main(String[] args) {

        // Create a bank account with initial balance
        BankAccount account = new BankAccount(5000);

        // Test operations
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(1200);      // Deposit money
        account.withdraw(800);      // Successful withdrawal
        account.withdraw(7000);     // Fails due to insufficient balance

        // Show final balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}
