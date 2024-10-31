
import java.io.*;
import java.util.*;

/**
 * 
 */
public interface HouseBuilder {

    /**
     * @return
     */
    public void buildFoundation();

    /**
     * @return
     */
    public void buildStructure();

    /**
     * @return
     */
    public void buildRoof();

    /**
     * @return
     */
    public void buildInterior();

    /**
     * @return
     */
    public House getHouse();

}