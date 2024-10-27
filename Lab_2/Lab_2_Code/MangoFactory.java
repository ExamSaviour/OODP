
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class MangoFactory implements ApparelFactory {

    /**
     * Default constructor
     */
    public MangoFactory() {
    }

    /**
     * @return
     */
    public Apparel createProductA() {
        // TODO implement here
        return new Dress();
    }

    /**
     * @return
     */
    public Apparel createProductB() {
        // TODO implement here
        return new Sweater();
    }
}