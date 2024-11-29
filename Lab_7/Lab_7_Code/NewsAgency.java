
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class NewsAgency implements Subject {

    /**
     * Default constructor
     */
    public NewsAgency() {
    }

    /**
     * 
     */
    private List<Observer> observers = new ArrayList<>();

    /**
     * @param observer 
     * @return
     */
    public void registerObserver(Observer observer) {
        // TODO implement here
        observers.add(observer);
    }

    /**
     * @param observer 
     * @return
     */
    public void removeObserver(Observer observer) {
        // TODO implement here
        observers.remove(observer);
    }

    /**
     * @param news
     * @return
     */
    public void notifyObserver(String news) {
        // TODO implement here
        for (Observer observer : observers) {
            observer.notify(news);
        }
    }

    /**
     * @param news 
     * @return
     */
    public void publishNews(String news) {
        // TODO implement here
        System.out.println("Publishing News: " + news);
        notifyObserver(news);
    }
}