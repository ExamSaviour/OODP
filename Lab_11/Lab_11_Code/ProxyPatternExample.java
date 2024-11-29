
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class ProxyPatternExample {

    /**
     * Default constructor
     */
    public ProxyPatternExample() {
    }

    /**
     * @param args 
     * @return
     */
    public static void main(String[] args) {
        // TODO implement here
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // First time loading
        image1.display();
        image2.display();

        // Second time, no loading
        image1.display();
    }

}