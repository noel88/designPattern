package decorator.ex1;

public class SubstractOperationExpression extends AbstractOperationExpression {

    @Override
    public double opreate() {

        AbstractExpression firstOperandExpression = operandList.get(0);
        AbstractExpression secondOperandExpression = operandList.get(1);

        double firstResult = firstOperandExpression.opreate();
        double secondResult = secondOperandExpression.opreate();

        return firstResult - secondResult;
    }
}
