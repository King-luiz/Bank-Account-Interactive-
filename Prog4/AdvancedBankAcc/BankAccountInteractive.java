// Title: Interactive BankAccount Program
// Description: Allows the user to deposit, withdraw, and check balance
//              through keyboard input.

import java.util.Scanner;

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
            System.out.println("Successfully Deposited: " + amount);
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
            System.out.println("Successfully Withdrawn: " + amount);
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

public class BankAccountInteractive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create account with user-defined initial balance
        System.out.print("Enter initial balance: ");
        double initial = scanner.nextDouble();
        BankAccount account = new BankAccount(initial);

        int choice;

        // Menu Loop
        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = scanner.nextDouble();
                    account.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double w = scanner.nextDouble();
                    account.withdraw(w);
                    break;

                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;

                case 4:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
