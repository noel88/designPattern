package decorator.ex1;

public class SqrtDecoratorExpression extends AbstractDecoratorExpression {

    public SqrtDecoratorExpression() {
        super();
    }

    public SqrtDecoratorExpression(AbstractExpression expression) {
        super(expression);
    }

    @Override
    public double opreate() {
        return Math.sqrt(expression.opreate());
    }

}
