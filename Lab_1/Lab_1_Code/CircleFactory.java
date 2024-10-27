
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class CircleFactory implements ShapeFactory {

    /**
     * Default constructor
     */
    public CircleFactory() {
    }

    /**
     * @return
     */
    public Shape createShape() {
        // TODO implement here
        return new Circle();
    }


}