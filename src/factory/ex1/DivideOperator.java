package factory.ex1;
// product 인터페이스를 구현한다.
public class DivideOperator extends AbstractOperator {

    @Override
    protected int getAnswer(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public String getDescription() {
        return "/";
    }
}
