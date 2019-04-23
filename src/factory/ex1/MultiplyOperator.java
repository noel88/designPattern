package factory.ex1;

import factory.ex1.AbstractOperator;

// product 인터페이스를 구현한다.
public class MultiplyOperator extends AbstractOperator {

    @Override
    protected int getAnswer(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public String getDescription() {
        return "*";
    }
}
