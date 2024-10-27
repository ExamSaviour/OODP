
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class RectangleFactory implements ShapeFactory {

    /**
     * Default constructor
     */
    public RectangleFactory() {
    }

    /**
     * @return
     */
    public Shape createShape() {
        // TODO implement here
        return new Rectangle();
    }
}