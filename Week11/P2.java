// 2. You are working on an e-commerce application where different payment methods are supported, including credit card, PayPal, and bank transfer. 
// Each payment method has its own validation and transaction process. 
// Implement a Java program using polymorphism to process payments using different payment methods.

package Week11;

public class P2 {
    public static void main(String[] args) {
        // Create instances of different payment methods
        PaymentMethod creditCard = new CreditCard("1234567890123456", "John Doe", "12/24", "123", 1000.0);
        PaymentMethod payPal = new PayPal("john.doe@example.com", "password123", 500.0); // Reduced balance for example
        PaymentMethod bankTransfer = new BankTransfer("9876543210", "Bank of Java", "BOJ12345", 2000.0);

        // Process payments using different methods
        processPayment(creditCard, 150.0);
        processPayment(payPal, 600.0); // Attempting to take more than available balance
        processPayment(bankTransfer, 300.0);
    }

    // Method to process payment
    public static void processPayment(PaymentMethod paymentMethod, double amount) {
        if (paymentMethod.validatePayment()) {
            paymentMethod.processTransaction(amount);
        } else {
            System.out.println("Payment validation failed.");
        }
    }
}

abstract class PaymentMethod {
   
    abstract boolean validatePayment();

    abstract void processTransaction(double amount);
}

// CreditCard class extending PaymentMethod
class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private String cvv;
    private double availableBalance; 

    public CreditCard(String cardNumber, String cardHolder, String expiryDate, String cvv, double availableBalance) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.availableBalance = availableBalance;
    }

    @Override
    boolean validatePayment() {
        System.out.println("Validating credit card...");
        return true;
    }

    @Override
    void processTransaction(double amount) {
        System.out.println("Processing credit card transaction of $" + amount);
        // Check if there's enough balance
        if (amount <= availableBalance) {
            availableBalance -= amount; // Deduct the amount
            System.out.println("Transaction successful. Remaining balance: $" + availableBalance);
        } else {
            System.out.println("Insufficient funds. Transaction failed.");
        }
    }
}

// PayPal class extending PaymentMethod
class PayPal extends PaymentMethod {
    private String email;
    private String password;
    private double availableBalance; 

    public PayPal(String email, String password, double availableBalance) {
        this.email = email;
        this.password = password;
        this.availableBalance = availableBalance;
    }

    @Override
    boolean validatePayment() {
        System.out.println("Validating PayPal account...");
        return true;
    }

    @Override
    void processTransaction(double amount) {
        System.out.println("Processing PayPal transaction of $" + amount);
        // Check if there's enough balance
        if (amount <= availableBalance) {
            availableBalance -= amount; // Deduct the amount
            System.out.println("Transaction successful. Remaining balance: $" + availableBalance);
        } else {
            System.out.println("Insufficient funds. Transaction failed.");
        }
    }
}

// BankTransfer class extending PaymentMethod
class BankTransfer extends PaymentMethod {
    private String bankAccount;
    private String bankName;
    private String swiftCode;
    private double availableBalance; 

    public BankTransfer(String bankAccount, String bankName, String swiftCode, double availableBalance) {
        this.bankAccount = bankAccount;
        this.bankName = bankName;
        this.swiftCode = swiftCode;
        this.availableBalance = availableBalance;
    }

    @Override
    boolean validatePayment() {
        System.out.println("Validating bank transfer details...");
        return true;
    }

    @Override
    void processTransaction(double amount) {
        System.out.println("Processing bank transfer transaction of $" + amount);
        // Check if there's enough balance
        if (amount <= availableBalance) {
            availableBalance -= amount; // Deduct the amount
            System.out.println("Transaction successful. Remaining balance: $" + availableBalance);
        } else {
            System.out.println("Insufficient funds. Transaction failed.");
        }
    }
}
