/**
 * @author Deepak D Nayak
 */
public class MilkDecorator extends CoffeeDecorator {

    /**
     * @param decoratedCoffee
     */
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    /**
     * @return
     */
    public String getDescription() {
        // TODO implement here
        return decoratedCoffee.getDescription() + ", Milk";
    }

    /**
     * @return
     */
    public double getCost() {
        // TODO implement here
        return decoratedCoffee.getCost() + 0.5;
    }

}