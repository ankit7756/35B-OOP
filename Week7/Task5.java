// Task 
// Make a class Song
// make 4 private property id, title, duration and artists
// make 2 public property album and description
// make constructor to set title and duration only
// make setter for id, duration and artists
// make getter for id, title, duration and artists
// make 2 object of Song
// Fill all the attributes
// Change the duration of 1st object
// Change the artists of 2nd object
// Print the following for both object
// Output
// Song 1
// Title: ABC
// Duration: 10
// Artists: XYZ
// Album: XX
// Description: Lorem Ipsum
// Song 2
// .. 

package Week7;

public class Task5 {
    // Private properties
    private int id;
    private String title;
    private int duration; // duration in seconds
    private String artists;

    // Public properties
    public String album;
    public String description;

    // Constructor to set title and duration only
    public Task5(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Setter for duration
    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Setter for artists
    public void setArtists(String artists) {
        this.artists = artists;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for duration
    public int getDuration() {
        return duration;
    }

    // Getter for artists
    public String getArtists() {
        return artists;
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating the first Song object
        Task5 song1 = new Task5("ABC", 300); // 300 seconds = 5 minutes
        song1.setId(1);
        song1.setArtists("XYZ");
        song1.album = "XX";
        song1.description = "Lorem Ipsum";

        // Creating the second Song object
        Task5 song2 = new Task5("DEF", 240); // 240 seconds = 4 minutes
        song2.setId(2);
        song2.setArtists("LMN");
        song2.album = "YY";
        song2.description = "Dolor Sit Amet";

        // Changing the duration of the first song
        song1.setDuration(600); // 600 seconds = 10 minutes

        // Changing the artists of the second song
        song2.setArtists("OPQ");

        // Printing details of both songs
        System.out.println("Song 1");
        System.out.println("Title: " + song1.getTitle());
        System.out.println("Duration: " + song1.getDuration());
        System.out.println("Artists: " + song1.getArtists());
        System.out.println("Album: " + song1.album);
        System.out.println("Description: " + song1.description);
        System.out.println();

        System.out.println("Song 2");
        System.out.println("Title: " + song2.getTitle());
        System.out.println("Duration: " + song2.getDuration());
        System.out.println("Artists: " + song2.getArtists());
        System.out.println("Album: " + song2.album);
        System.out.println("Description: " + song2.description);
    }
}
