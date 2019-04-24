package decorator.ex1;

public class PowDecoratorExpression extends AbstractDecoratorExpression {

    private int exponent = 2;

    public PowDecoratorExpression() {
        super();
    }

    public PowDecoratorExpression(AbstractExpression expression, int exponent) {
        super(expression);
        this.exponent = exponent;
    }

    @Override
    public double opreate() {
        return Math.pow(this.expression.opreate(), exponent);
    }
}
