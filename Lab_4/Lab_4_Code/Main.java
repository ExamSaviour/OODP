
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new PlainCoffee();
        System.out.println("Description: "+ coffee.getDescription());
        System.out.println("Cost: $"+ coffee.getCost());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Description: "+ milkCoffee.getDescription());
        System.out.println("Cost: $"+ milkCoffee.getCost());

        Coffee sugarCoffee = new SugarDecorator(new PlainCoffee());
        System.out.println("Description: "+ sugarCoffee.getDescription());
        System.out.println("Cost: $"+ sugarCoffee.getCost());
    }

}