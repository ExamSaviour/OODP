
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class Client {

    /**
     * Default constructor
     */
    public Client() {

    }

    public static void main(String[] args) {
        // Create subsystem objects
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        MediaPlayer mediaPlayer = new MediaPlayer();

        // Create the Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projector, soundSystem, mediaPlayer);

        // Use the Facade
        homeTheater.watchMovie();  // Start movie
        System.out.println("\n...After some time...\n");
        homeTheater.endMovie();    // End movie
    }

}