package decorator.ex1;

import java.util.ArrayList;

public abstract class AbstractOperationExpression extends AbstractExpression {

    protected ArrayList<AbstractExpression> operandList = new ArrayList<>();

    public final void addOperandExpression(AbstractExpression operandExpression) {
        operandList.add(operandExpression);
    }

}
