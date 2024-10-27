
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class SquareFactory implements ShapeFactory {

    /**
     * Default constructor
     */
    public SquareFactory() {
    }

    /**
     * @return
     */
    public Shape createShape() {
        // TODO implement here
        return new Circle();
    }
}