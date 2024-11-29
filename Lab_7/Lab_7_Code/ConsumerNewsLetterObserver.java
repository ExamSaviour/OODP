
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class ConsumerNewsLetterObserver implements Observer {

    /**
     * Default constructor
     */
    public ConsumerNewsLetterObserver() {
    }

    /**
     * @param news 
     * @return
     */
    public void notify(String news) {
        // TODO implement here
        System.out.println("Consumer Newsletter Update: " + news);
    }
}