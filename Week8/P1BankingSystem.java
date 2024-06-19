// You are building a banking application that has a BankAccount class. 
// Implement the BankAccount class with encapsulation principles in mind. 
// Include private instance variables for the
// account number, account holder name, and account balance. 
// Provide public methods to allow clients to deposit and withdraw funds, 
// as well as access the account balance. 
// Ensure that the account balance cannot be accessed or modified directly.
// Ensure that user cannot withdraw balance if it can go to negative
// Note make contructor to fill the attribute on account opening
// Make getter for account number and account holder name 


package Week8;

public class P1BankingSystem {
    public static void main(String[] args) {
        // Create a new BankAccount object
        BankAccount account = new BankAccount("123456789", "Ankit Sharma", 1000.0);

        // Display account details
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit funds
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw funds
        boolean withdrawSuccessful = account.withdraw(300.0);
        if (withdrawSuccessful) {
            System.out.println("Balance after withdrawal: " + account.getBalance());
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }

        // Attempt to withdraw more than the balance
        withdrawSuccessful = account.withdraw(1500.0);
        if (withdrawSuccessful) {
            System.out.println("Balance after withdrawal: " + account.getBalance());
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

class BankAccount {
    // Private instance variables
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    // Constructor to initialize the attributes on account opening
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = initialBalance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Method to get the current balance
    public double getBalance() {
        return accountBalance;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw funds
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdraw: " + amount);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
            return false;
        }
    }
}
