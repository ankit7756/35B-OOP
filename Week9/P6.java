// 6. Let's examine the Java program given. 
// It involves multiple classes that depict different book types, including Book, FictionBook, NonFictionBook, and TechnicalBook. 
// The Book class features a constructor and a method called displayDetails(). 
// This method is responsible for outputting the title and author of a book. 
// The remaining classes inherit both the constructor and methods of the Book class as they extend it.

// Hint: Use super keywords

package Week9;

public class P6 {
    public static void main(String[] args) {
        // Creating instances of different types of books
        FictionBook fiction = new FictionBook("To Kill a Mockingbird", "Harper Lee");
        NonFictionBook nonFiction = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook technical = new TechnicalBook("Introduction to Algorithms", "Thomas H. Cormen");

        // Displaying details of each book
        fiction.displayDetails();
        nonFiction.displayDetails();
        technical.displayDetails();
    }
}

// Base class Book
class Book {
    private String title;
    private String author;

    // Constructor for Book class
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display details of the book
    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// FictionBook class extending Book
class FictionBook extends Book {
    // Constructor for FictionBook class
    public FictionBook(String title, String author) {
        super(title, author);
    }
}

// NonFictionBook class extending Book
class NonFictionBook extends Book {
    // Constructor for NonFictionBook class
    public NonFictionBook(String title, String author) {
        super(title, author);
    }
}

// TechnicalBook class extending Book
class TechnicalBook extends Book {
    // Constructor for TechnicalBook class
    public TechnicalBook(String title, String author) {
        super(title, author);
    }
}
