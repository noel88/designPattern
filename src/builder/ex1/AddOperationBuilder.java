package builder.ex1;


/*
*  인터페이스 구현부
* */

public class AddOperationBuilder extends AbstarctOperationBuilder {

    public AddOperationBuilder(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public void buildOperator() {
        result.append(" + ");
    }
}
