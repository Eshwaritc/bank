import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Current balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn " + amount);
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("-----------------------\n");
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a new bank account
        System.out.println("Welcome to Simple Banking System");
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();

        double initialBalance = 0;
        while (true) {
            System.out.print("Enter Initial Balance: ");
            if (sc.hasNextDouble()) {
                initialBalance = sc.nextDouble();
                if (initialBalance >= 0) break;
                else System.out.println("Initial balance cannot be negative!");
            } else {
                System.out.println("Please enter a valid number!");
                sc.next(); // clear invalid input
            }
        }

        BankAccount account = new BankAccount(name, accNumber, initialBalance);

        // Menu-driven program
        int choice;
        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.println("========================");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1-5.");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    account.displayAccountDetails();
                    break;
                case 5:
                    System.out.println("Thank you for using the banking system!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select between 1-5.");
            }
        } while (choice != 5);

        sc.close();
    }
}