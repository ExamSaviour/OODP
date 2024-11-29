
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class CompanyNewsLetterObserver implements Observer {

    /**
     * Default constructor
     */
    public CompanyNewsLetterObserver() {
    }

    /**
     * @param news 
     * @return
     */
    public void notify(String news) {
        // TODO implement here
        System.out.println("Company Newsletter Update: " + news);
    }
}