/**
 * @author Deepak D Nayak
 */
public abstract class CoffeeDecorator implements Coffee {

    /**
     * Default constructor
     */
    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    /**
     * 
     */
    protected Coffee decoratedCoffee;

    /**
     * @param decoratedCoffee
     */
    public void CoffeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    /**
     * @return
     */
    public String getDescription() {
        // TODO implement here
        return decoratedCoffee.getDescription();
    }

    /**
     * @return
     */
    public double getCost() {
        // TODO implement here
        return decoratedCoffee.getCost();
    }
}