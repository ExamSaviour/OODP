
import java.io.*;
import java.util.*;

/**
 * 
 */
public interface Subject {

    /**
     * @param observer 
     * @return
     */
    public void addObserver(Observer observer);

    /**
     * @param observer 
     * @return
     */
    public void removeObserver(Observer observer);

    /**
     * @return
     */
    public void notifyObservers();

}