package AbstractFactory.ex2;

public class Client {
    public static void main(String[] args) {
        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
        factoryOfComputerFactory.createComputer("Lg");
    }
}
