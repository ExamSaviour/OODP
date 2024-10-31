
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class ConcreteHouseBuilder implements HouseBuilder {

    /**
     * Default constructor
     */
    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    /**
     *
     */
    private House house;

    /**
     * @return
     */
    public void buildFoundation() {
        // TODO implement here
        house.setFoundation("Concrete, Brick and Stone");
        System.out.println("ConcreteHouseBuilder: Foundation complete...");
    }

    /**
     * @return
     */
    public void buildStructure() {
        // TODO implement here
        house.setStructure("Concrete and Steel");
        System.out.println("ConcreteHouseBuilder: Structure complete...");
    }

    /**
     * @return
     */
    public void buildRoof() {
        // TODO implement here
        house.setRoof("Concrete and reinforced Steel");
        System.out.println("ConcreteHouseBuilder: Roof complete...");
    }

    /**
     * @return
     */
    public void buildInterior() {
        // TODO implement here
        house.setInterior("Concrete finishing");
        System.out.println("ConcreteHouseBuilder: Interior complete...");
    }

    /**
     * @return
     */
    public House getHouse() {
        // TODO implement here
        return this.house;
    }
}