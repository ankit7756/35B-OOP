// 4. Design and implement a Java program that simulates a financial transaction system. 
// Your system should be capable of processing different types of transactions, such as deposits and withdrawals, 
// and alerting if any transactions exceed certain limits. Use interfaces to define common behaviors for transactions and implement these behaviors in different transaction classes.

// Create an interface named Transaction with at least two methods:

// getAmount() which returns the amount of the transaction as a double
// isValid() which returns a boolean indicating if the transaction is valid based on certain criteria.

// Implement the Transaction interface in at least three separate classes,
// DepositTransaction and Withdrawal Transaction. Each class should have a constructor that sets a limit for transactions and specific logic to determine if the transaction is valid.


package Week14;

public class P4 {
    public static void main(String[] args) {
        Transaction deposit = new DepositTransaction(500, 1000); // Deposit of $500 with a limit of $1000
        Transaction withdrawal = new WithdrawalTransaction(200, 300); // Withdrawal of $200 with a limit of $300
        
        processTransaction(deposit);
        processTransaction(withdrawal);
    }

    // Method to process a transaction and display its validity
    public static void processTransaction(Transaction transaction) {
        System.out.println("Transaction Amount: $" + transaction.getAmount());
        if (transaction.isValid()) {
            System.out.println("Transaction is valid.");
        } else {
            System.out.println("Transaction exceeds the limit and is invalid.");
        }
        System.out.println();
    }
}

// Transaction interface with common behaviors
interface Transaction {
    double getAmount();
    boolean isValid();
}

// DepositTransaction class implementing the Transaction interface
class DepositTransaction implements Transaction {
    private double amount;
    private double limit;

    // Constructor to set the transaction amount and limit
    public DepositTransaction(double amount, double limit) {
        this.amount = amount;
        this.limit = limit;
    }

    // Get the transaction amount
    @Override
    public double getAmount() {
        return amount;
    }
    // Check if the transaction is valid based on the limit
    @Override
    public boolean isValid() {
        return amount <= limit;
    }
}
// WithdrawalTransaction class implementing the Transaction interface
class WithdrawalTransaction implements Transaction {
    private double amount;
    private double limit;

    // Constructor to set the transaction amount and limit
    public WithdrawalTransaction(double amount, double limit) {
        this.amount = amount;
        this.limit = limit;
    }

    // Get the transaction amount
    @Override
    public double getAmount() {
        return amount;
    }

    // Check if the transaction is valid based on the limit
    @Override
    public boolean isValid() {
        return amount <= limit;
    }
}

