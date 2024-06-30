// This is a java program where all four properties of OOP are used in a single program.

public class AllProperties {
    public static void main(String[] args) {
        // Encapsulation: Creating and using BankAccount objects
        BankAccount account1 = new BankAccount("ACC001", 5000);
        account1.deposit(1000);
        account1.withdraw(2000);

        // Inheritance and Polymorphism: Creating and using SavingsAccount and CurrentAccount objects
        SavingsAccount savingsAccount = new SavingsAccount("SAV001", 10000, 5.0);
        savingsAccount.deposit(500);
        savingsAccount.calculateInterest();

        CurrentAccount currentAccount = new CurrentAccount("CUR001", 20000, 10000);
        currentAccount.withdraw(25000); // Using overridden withdraw method

        // Abstraction and Polymorphism: Creating and using Circle object
        Circle circle = new Circle(5.0);
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);
    }
}

// Encapsulation: Using private variables and public methods to control access
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor for initializing account details
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for account balance
    public double getBalance() {
        return balance;
    }

    // Method for depositing money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method for withdrawing money from the account
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }
}

// Inheritance: Using subclasses to extend functionality
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor to initialize savings account with interest rate
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Calling superclass constructor
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest); // Adding interest to the balance using inherited deposit method
        System.out.println("Interest calculated and deposited: " + interest);
    }
}

// Polymorphism: Using method overriding
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    // Constructor to initialize current account with overdraft limit
    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance); // Calling superclass constructor
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding withdraw method to allow overdraft within limit
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            double newBalance = getBalance() - amount;
            if (newBalance < 0) {
                System.out.println("Overdraft used: " + (-newBalance));
            } else {
                System.out.println(amount + " withdrawn successfully.");
            }
        } else {
            System.out.println("Insufficient funds or exceeds overdraft limit.");
        }
    }
}

// Abstraction: Using abstract class and methods
abstract class Shape {
    // Abstract method for calculating area (to be implemented by subclasses)
    public abstract double calculateArea();
}

// Concrete subclass implementing Shape abstract class
class Circle extends Shape {
    private double radius;

    // Constructor to initialize circle with radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override calculateArea method to calculate area of circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

