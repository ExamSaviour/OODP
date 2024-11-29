
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class HomeTheaterFacade {

    /**
     * Default constructor
     */
    public HomeTheaterFacade() {
    }

    /**
     * 
     */
    private Projector projector;

    /**
     * 
     */
    private SoundSystem soundSystem;

    /**
     * 
     */
    private MediaPlayer mediaPlayer;

    /**
     * @param projector 
     * @param soundSystem 
     * @param mediaPlayer
     */
    public HomeTheaterFacade(Projector projector, SoundSystem soundSystem, MediaPlayer mediaPlayer) {
        // TODO implement here
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.mediaPlayer = mediaPlayer;
    }

    /**
     * @return
     */
    public void watchMovie() {
        // TODO implement here
        System.out.println("Setting up the home theatre to watch a movie...");
        projector.on();
        soundSystem.on();
        mediaPlayer.play();
        System.out.println("Enjoy your movie!");
    }

    /**
     * @return
     */
    public void endMovie() {
        // TODO implement here
        System.out.println("Shutting down the home theatre...");
        mediaPlayer.stop();
        soundSystem.off();
        projector.off();
        System.out.println("Goodbye!");
    }

}