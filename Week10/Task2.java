/*
 * Task
 * Make an interface Media
 * make the following functions
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String nowPlaying()
 * 
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current)
 * 
 * Make an interface OnlineAsset
 * make the following functions
 * void download()
 * 
 * Make a class Spotify and implement DigitalMedia and OnlineAsset
 */ 


 package Week10;

 public class Task2 {
    public static void main(String[] args) {
        Spotify spotify = new Spotify("London by Lil Jhola", 5.6); // 5.6 MB

        spotify.play();
        System.out.println(spotify.nowPlaying());
        spotify.pause();
        spotify.next();
        spotify.previous();
        System.out.println("Total size: " + spotify.size() + " MB");
        System.out.println("Remaining size after 2.3 MB: " + spotify.remaining(2.3) + " MB");
        spotify.download();
    }
}

 // Interface Media
 interface Media {
     void play();
     void pause();
     void next();
     void previous();
     String nowPlaying();
 }
 
 // Interface DigitalMedia extending Media
 interface DigitalMedia extends Media {
     double size();
     double remaining(double current);
 }
 
 // Interface OnlineAsset
 interface OnlineAsset {
     void download();
 }
 
 // Class Spotify implementing DigitalMedia and OnlineAsset
 class Spotify implements DigitalMedia, OnlineAsset {
     private String currentSong;
     private double totalSize; // in MB
 
     public Spotify(String currentSong, double totalSize) {
         this.currentSong = currentSong;
         this.totalSize = totalSize;
     }
 
     @Override
     public void play() {
         System.out.println("Playing: " + currentSong);
     }
 
     @Override
     public void pause() {
         System.out.println("Paused: " + currentSong);
     }
 
     @Override
     public void next() {
         System.out.println("Skipping to next track.");
         // Logic to skip to the next track (not implemented)
     }
 
     @Override
     public void previous() {
         System.out.println("Going back to previous track.");
         // Logic to go back to the previous track (not implemented)
     }
 
     @Override
     public String nowPlaying() {
         return "Now Playing: " + currentSong;
     }
 
     @Override
     public double size() {
         return totalSize;
     }
 
     @Override
     public double remaining(double current) {
         return totalSize - current;
     }
 
     @Override
     public void download() {
         System.out.println("Downloading: " + currentSong);
         // Logic to download the track (not implemented)
     }
 }
 
