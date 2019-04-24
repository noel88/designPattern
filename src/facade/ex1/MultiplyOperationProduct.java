package facade.ex1;

public class MultiplyOperationProduct extends AbstractOperationProduct {

    @Override
    public void operate(int firstNumber, int secondNumber) {

        int answer = firstNumber * secondNumber;

        System.out.println(firstNumber + " * " + secondNumber + " = " + answer);
    }

}
