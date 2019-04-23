package singleton.ex2;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("Singleton Instance created..");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
