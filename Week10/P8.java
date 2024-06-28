// 8. You are building a library management system. Design an interface named "LibraryItem" with the following methods:
// String getTitle() to retrieve the title of the library item
// String getAuthor() to retrieve the author of the library item
// int getYear() to retrieve the publication year of the library item
// boolean isAvailable() to check if the library item is currently available for borrowing.

package Week10;

public class P8 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "John Smith", 2022, true);

        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Year: " + b1.getYear());
        System.out.println("Available: " + b1.isAvailable());
    }
}

interface LibraryItem{
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem{
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(String title, String author, int year, boolean available){
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public String getAuthor(){
        return author;
    }

    @Override
    public int getYear(){
        return year;
    }
    
    @Override
    public boolean isAvailable(){
        return available;
    }
}