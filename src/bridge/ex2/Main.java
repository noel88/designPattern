package bridge.ex2;


public class Main {

    public static void main(String[] args) {

        Display d1 = new Display(new StringDisplayImpl("Hello!"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello world!"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello End!"));

        d1.display();
        d2.display();
        d3.display();

        d3.multiDisplay(5);

    }

}
