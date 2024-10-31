
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
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        Director director = new Director(concreteHouseBuilder);
        House house = director.constructHouse();
        System.out.println("House constructed: "+house);
    }

}