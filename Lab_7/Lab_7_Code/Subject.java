
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
    public void registerObserver(Observer observer);

    /**
     * @param observer 
     * @return
     */
    public void removeObserver(Observer observer);

    /**
     * @param news
     * @return
     */
    public void notifyObserver(String news);

}