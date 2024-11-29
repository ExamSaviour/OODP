
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class RealImage implements Image {

    /**
     * Default constructor
     */
    public RealImage() {
    }

    /**
     * 
     */
    private String filename;

    /**
     * @param filename
     */
    public RealImage(String filename) {
        // TODO implement here
        this.filename = filename;
        loadImageFromDisk();
    }

    /**
     * @return
     */
    private void loadImageFromDisk() {
        // TODO implement here
        System.out.println("Loading " + filename);
    }

    /**
     * @return
     */
    public void display() {
        // TODO implement here
        System.out.println("Displaying " + filename);
    }

}