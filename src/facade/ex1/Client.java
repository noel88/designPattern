package facade.ex1;

public class Client {

    public static void main(String[] args) {

        CalculatorFacade calculator = new CalculatorFacade();

        String[] expressions = {"100+20", "100-2", "100*20", "100/20"};

        for (int i = 0; i < expressions.length; i++) {
            calculator.calculate(expressions[i]);
        }
    }

}
