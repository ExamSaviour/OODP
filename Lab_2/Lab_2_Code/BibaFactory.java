/**
 * @author Deepak D Nayak
 */
public class BibaFactory implements ApparelFactory {

    /**
     * Default constructor
     */
    public BibaFactory() {
    }

    /**
     * @return
     */
    public Apparel createProductA() {
        // TODO implement here
        return new Saree();
    }

    /**
     * @return
     */
    public Apparel createProductB() {
        // TODO implement here
        return new EthnicTop();
    }
}