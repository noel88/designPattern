package decorator.ex1;

public class Calculator {

    private AbstractExpression expression;

    public Calculator() {
        super();
    }

    public double calculator() {
        return expression.opreate();
    }

    public void setExpression(AbstractExpression expression) {
        this.expression = expression;
    }

}
