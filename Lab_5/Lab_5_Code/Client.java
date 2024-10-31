
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class Client {
    /**
     * @param args 
     * @return
     */
    public static void main(String[] args) {
        Singleton.getInstance().doSomething();
    }

}