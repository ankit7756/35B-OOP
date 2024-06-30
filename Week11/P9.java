// 9. You are developing a banking application that includes different types of accounts. 
// Each account has a method named calculateInterest to calculate the interest based on the account type. 
// Implement the calculateInterest method in the base class Account 
// and override it in the derived classes SavingsAccount and FixedDepositAccount to calculate interest based on their specific rules. 
// Write the code to demonstrate method overriding for calculating interest.

package Week11;

public class P9 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123456", 10000.0, 4.5);
        savingsAccount.calculateInterest();
        System.out.println(); 
        
        FixedDepositAccount fdAccount = new FixedDepositAccount("FD789012", 50000.0, 6.0, 12);
        fdAccount.calculateInterest();
    }
}

abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void calculateInterest();
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest calculation for Savings Account: " + accountNumber);
        System.out.println("Current balance: " + balance);
        double interest = balance * (interestRate / 100);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest earned: $" + interest);
    }
}

class FixedDepositAccount extends Account {
    private double interestRate;
    private int term; // in months

    public FixedDepositAccount(String accountNumber, double balance, double interestRate, int term) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
        this.term = term;
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest calculation for Fixed Deposit Account: " + accountNumber);
        System.out.println("Current balance: " + balance);
        double interest = balance * (interestRate / 100) * (term / 12.0); // assuming interest compounded annually
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Term: " + term + " months");
        System.out.println("Interest earned: $" + interest);
    }
}
