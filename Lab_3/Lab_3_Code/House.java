
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class House {

    /**
     * Default constructor
     */
    public House() {
    }

    /**
     * 
     */
    public String foundation;

    /**
     * 
     */
    public String structure;

    /**
     * 
     */
    public String roof;

    /**
     * 
     */
    public String interior;

    /**
     * @param foundation
     * @return
     */
    public void setFoundation(String foundation) {
        // TODO implement here
        this.foundation = foundation;
    }

    /**
     * @param structure 
     * @return
     */
    public void setStructure(String structure) {
        // TODO implement here
        this.structure = structure;
    }

    /**
     * @param roof 
     * @return
     */
    public void setRoof(String roof) {
        // TODO implement here
        this.roof = roof;
    }

    /**
     * @param interior 
     * @return
     */
    public void setInterior(String interior) {
        // TODO implement here
        this.interior = interior;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "House [foundation = "+foundation+", structure = "+structure+", roof = "+roof+", interior = "+interior;
    }

}