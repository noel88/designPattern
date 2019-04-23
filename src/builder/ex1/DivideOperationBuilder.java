package builder.ex1;

/*
 *  인터페이스 구현부
 * */


public class DivideOperationBuilder extends AbstarctOperationBuilder {

    public DivideOperationBuilder(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public void buildOperator() {
        result.append(" / ");
    }
}
