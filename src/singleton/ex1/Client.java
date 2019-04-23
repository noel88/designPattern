package singleton.ex1;

public class Client {

    public static void main(String[] args) {

        OperationSingleton calculatorSingleton = OperationSingleton.getInstance();
//        OperationSingleton calculatorSingleton = new OperationSingleton();


        int firstNumber = 100;
        int secondNumber = 20;

        calculatorSingleton.operate(OperationSingleton.ADD_OPREATION, firstNumber, secondNumber);
        calculatorSingleton.operate(OperationSingleton.SUBSTRACT_OPERATION, firstNumber, secondNumber);
        calculatorSingleton.operate(OperationSingleton.MULTIPLY_OPREATION, firstNumber, secondNumber);
        calculatorSingleton.operate(OperationSingleton.DIVIDE_OPREATION, firstNumber, secondNumber);
    }

}
