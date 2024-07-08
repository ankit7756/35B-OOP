// 2. Create a BankAccount class to simulate a bank account. The class should have the following attributes: account number, account holder name, and balance.
// \Include methods to deposit(), withdraw(), and checkBalance().
// Implement functionality to
// - Create new accounts
// - Deposit money into the account
// - Withdraw money
// - Check the account balance.

package Week14;

public class P2 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", "Alice Johnson", 5000.0);
        BankAccount account2 = new BankAccount("987654321", "Bob Smith", 3000.0);

        // Performing operations on account1
        account1.deposit(2000.0);
        account1.withdraw(1000.0);
        account1.checkBalance();
        System.out.println(); 
        // Performing operations on account2
        account2.deposit(1500.0);
        account2.withdraw(3500.0);
        account2.checkBalance();
    }
}

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the bank account
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to check the balance
    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
}

