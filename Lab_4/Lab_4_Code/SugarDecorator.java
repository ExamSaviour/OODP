/**
 * @author Deepak D Nayak
 */
public class SugarDecorator extends CoffeeDecorator {
    /**
     * @param decoratedCoffee
     */
    public SugarDecorator(Coffee decoratedCoffee) {
        // TODO implement here
        super(decoratedCoffee);
    }

    /**
     * @return
     */
    public String getDescription() {
        // TODO implement here
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    /**
     * @return
     */
    public double getCost() {
        // TODO implement here
        return decoratedCoffee.getCost() + 0.2;
    }

}