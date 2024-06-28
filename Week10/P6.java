// 6. You are developing a media player application. There is a base class called MediaPlayer, 
// which has methods like play(), pause(), and stop(). 
// The VideoPlayer class inherits from MediaPlayer and adds methods like rewind() and fastForward(). 
// Additionally, there is an interface called Playlist, which defines methods like addSong() and removeSong(). 
// The VideoPlayer class implements the Playlist interface. 
// Implement the classes and demonstrate inheritance with interface by 
// creating objects of the VideoPlayer class and calling its methods as well as the interface methods.

package Week10;

public class P6 {
    public static void main(String[] args) {
        VideoPlayer vp = new VideoPlayer();
        
        // Call methods from MediaPlayer class
        vp.play();
        vp.pause();
        vp.stop();

        // Call methods from VideoPlayer class
        vp.rewind();
        vp.fastForward();

        // Call methods from Playlist interface
        vp.addSong("Song 1");
        vp.addSong("Song 2");
        vp.removeSong("Song 1");
    }
}

// Base class
class MediaPlayer {
    void play() {
        System.out.println("Playing media...");
    }
    
    void pause() {
        System.out.println("Pausing media...");
    }
    
    void stop() {
        System.out.println("Stopping media...");
    }
}

// Interface
interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

// Subclass that inherits from MediaPlayer and implements Playlist
class VideoPlayer extends MediaPlayer implements Playlist {
    void rewind() {
        System.out.println("Rewinding video...");
    }
    
    void fastForward() {
        System.out.println("Fast forwarding video...");
    }
    
    @Override
    public void addSong(String song) {
        System.out.println("Adding song: " + song);
    }
    
    @Override
    public void removeSong(String song) {
        System.out.println("Removing song: " + song);
    }
}
