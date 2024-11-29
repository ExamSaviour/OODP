
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class WeatherStation implements Subject {

    /**
     * Default constructor
     */
    public WeatherStation() {
        observers = new ArrayList<>();
    }

    /**
     * 
     */
    public List<Observer> observers;

    /**
     * 
     */
    public String weather;

    /**
     * @param observer 
     * @return
     */
    public void addObserver(Observer observer) {
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
     * @return
     */
    public void notifyObservers() {
        // TODO implement here
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }

    /**
     * @param weather 
     * @return
     */
    public void setWeather(String weather) {
        // TODO implement here
        this.weather = weather;
        notifyObservers();
    }
}