
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class ProxyImage implements Image {

    /**
     * Default constructor
     */
    public ProxyImage() {
    }

    /**
     * 
     */
    private RealImage realImage;

    /**
     * 
     */
    public String filename;

    /**
     * @param filename
     */
    public ProxyImage(String filename) {
        // TODO implement here
        this.filename = filename;
    }

    /**
     * @return
     */
    public void display() {
        // TODO implement here
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}