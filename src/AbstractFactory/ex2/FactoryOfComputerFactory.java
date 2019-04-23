package AbstractFactory.ex2;

public class FactoryOfComputerFactory {

    public void createComputer(String type) {
        ComputerFactory computerFactory = null;
        switch (type) {
            case "Lg":
                computerFactory = new LgComputerFactory();
                break;
            case "Samsung":
                computerFactory = new SamsungComputerFactory();
                break;
        }

        computerFactory.createKeyboard();
        computerFactory.createMouse();
    }
}
