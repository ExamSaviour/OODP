
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class Director {

    /**
     * Default constructor
     */
    public Director() {
    }

    /**
     * 
     */
    public HouseBuilder houseBuilder;

    /**
     * @param houseBuilder
     */
    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * @return
     */
    public House constructHouse() {
        houseBuilder.buildFoundation();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
        return houseBuilder.getHouse();
    }

}