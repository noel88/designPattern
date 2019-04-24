package decorator.ex1;

public class FracDecoratorExpression extends AbstractDecoratorExpression {

    public FracDecoratorExpression() {
        super();
    }

    public FracDecoratorExpression(AbstractExpression expression) {
        super(expression);
    }

    @Override
    public double opreate() {
        return 1 / expression.opreate();
    }

}
