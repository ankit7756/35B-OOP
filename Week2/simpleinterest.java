package Week2;

public class simpleinterest {
    public static void main(String[] args) {
        // Declare variables
        double amount = 1000; // Principal amount
        double rate = 5; // Annual interest rate
        int time = 2; // Time period in years

        // Calculate simple interest
        double simpleInterest = (amount * rate * time) / 100;

        // Print the result
        System.out.println("Principal: Rs. " + amount);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Simple Interest: Rs. " + simpleInterest);
    }
}

