
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class SuperFactory {

    /**
     * Default constructor
     */
    public SuperFactory() {
    }

    /**
     * @param brand 
     * @return
     */
    public static ApparelFactory getFactory(String brand) {
        switch (brand) {
            case "Nike":
                return new NikeFactory();
            case "Mango":
                return new MangoFactory();
            case "Biba":
                return new BibaFactory();
            default:
                throw new IllegalArgumentException("Unknown brand : "+brand);
        }
    }
}