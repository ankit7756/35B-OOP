// 7. Design and implement a simple Java application that prompts the user to enter a string within a specified length, 
// for example, between 5 and 20 characters. Your application should throw and handle a custom exception if the user enters a string outside this length.

// - InvalidStringLengthException:
// - A custom exception that is thrown when the user enters a string with a length outside the valid range (5 to 20 characters).


package Week14;

import java.util.Scanner;

// Custom exception for invalid string length
class InvalidStringLengthException extends Exception {
    public InvalidStringLengthException(String message) {
        super(message);
    }
}

// Main class to handle user input and validate string length
public class P7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (5 to 20 characters): ");
        String userInput = scanner.nextLine();

        try {
            validateStringLength(userInput);
            System.out.println("Valid string: " + userInput);
        } catch (InvalidStringLengthException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to validate the length of the string
    public static void validateStringLength(String str) throws InvalidStringLengthException {
        if (str.length() < 5 || str.length() > 20) {
            throw new InvalidStringLengthException("String length must be between 5 and 20 characters.");
        }
    }
}
