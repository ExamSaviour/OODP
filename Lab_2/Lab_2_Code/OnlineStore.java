public class OnlineStore {
    public static void main(String[] args) {

        ApparelFactory nikeFactory = SuperFactory.getFactory("Nike");
        Apparel nikeProductA = nikeFactory.createProductA();
        Apparel nikeProductB = nikeFactory.createProductB();
        nikeProductA.produce();
        nikeProductB.produce();

        ApparelFactory mangoFactory = SuperFactory.getFactory("Mango");
        Apparel mangoProductA = mangoFactory.createProductA();
        Apparel mangoProductB = mangoFactory.createProductB();
        mangoProductA.produce();
        mangoProductB.produce();

        ApparelFactory bibaFactory = SuperFactory.getFactory("Biba");
        Apparel bibaProductA = bibaFactory.createProductA();
        Apparel bibaProductB = bibaFactory.createProductB();
        bibaProductA.produce();
        bibaProductB.produce();
        
    }
}
