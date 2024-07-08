// 8. Design and implement a simple Java application that prompts the user to enter a valid email address. 
// Your application should throw and handle a custom exception if the user enters an invalid email address.

// - InvalidEmailException:
// - A custom exception that is thrown when the user enters an email address that does not match a valid email pattern (e.g., it should contain '@' and '.' characters).


package Week14;

import java.util.Scanner;

// Custom exception for invalid email addresses
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

// Main class to handle user input and validate email addresses
public class P8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a valid email address: ");
        String userEmail = scanner.nextLine();

        try {
            validateEmail(userEmail);
            System.out.println("Valid email address: " + userEmail);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to validate the email address
    public static void validateEmail(String email) throws InvalidEmailException {
        boolean isValid = false;

        // Check if email contains '@' and '.'
        if (email.contains("@") && email.contains(".")) {
            // Check if '@' is not the first or last character
            int atIndex = email.indexOf("@");
            if (atIndex > 0 && atIndex < email.length() - 1) {
                // Check if '.' is after '@' and not the last character
                int dotIndex = email.indexOf(".", atIndex);
                if (dotIndex > atIndex + 1 && dotIndex < email.length() - 1) {
                    isValid = true;
                }
            }
        }

        if (!isValid) {
            throw new InvalidEmailException("Invalid email address.");
        }
    }
}
