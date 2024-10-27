
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class NikeFactory implements ApparelFactory {

    /**
     * Default constructor
     */
    public NikeFactory() {
    }

    /**
     * @return
     */
    public Apparel createProductA() {
        // TODO implement here
        return new Shoes();
    }

    /**
     * @return
     */
    public Apparel createProductB() {
        // TODO implement here
        return new TShirt();
    }
}