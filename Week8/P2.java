// 2. You are developing a library management system and need to implement a Book class. 
// The Book class should have private instance variables for the book title, author name, and publication year.
// Implement appropriate getter and setter methods to ensure encapsulation. 
// Additionally, include a private variable to track the availability of the book (e.g., true if available, false if borrowed), 
// and provide a public method to borrow the book, updating its availability status.

package Week8;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        // Create a new Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter book details
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author name: ");
        String author = scanner.nextLine();

        System.out.print("Enter publication year: ");
        int publicationYear = scanner.nextInt();
        scanner.nextLine(); // Consume newline character left by nextInt()

        // Create a new Book object with user-provided details
        Book book = new Book(title, author, publicationYear);

        // Accessing book details using getters
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publication Year: " + book.getPublicationYear());
        System.out.println("Available: " + book.isAvailable());

        // Borrow the book
        book.borrowBook();

        // Try to borrow the book again (should be unavailable now)
        book.borrowBook();

        // Close the scanner
        scanner.close();
    }
}

class Book {
    // Private instance variables
    private String title;
    private String author;
    private int publicationYear;
    private boolean available;

    // Constructor to initialize the book details
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = true; // Assume book is available when created
    }

    // Getter for book title
    public String getTitle() {
        return title;
    }

    // Getter for author name
    public String getAuthor() {
        return author;
    }

    // Getter for publication year
    public int getPublicationYear() {
        return publicationYear;
    }

    // Getter for availability status
    public boolean isAvailable() {
        return available;
    }

    // Private method to set the availability of the book
    private void setAvailable(boolean available) {
        this.available = available;
    }

    // Public method to borrow the book
    public void borrowBook() {
        if (available) {
            setAvailable(false); // Book is no longer available
            System.out.println("Book '" + title + "' by " + author + " borrowed successfully.");
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently not available.");
        }
    }
}
