
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class Singleton {
    /**
     * 
     */
    private static Singleton instance;

    /**
     * 
     */
    private Singleton() {
        System.out.println("Singleton is Instantiated.");
    }

    /**
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * @return
     */
    public static void doSomething() {
        // TODO implement here
        System.out.println("Something is Done.");
    }
}