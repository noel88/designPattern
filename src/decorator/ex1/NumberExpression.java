package decorator.ex1;

public class NumberExpression extends AbstractExpression {

    private int value;

    public NumberExpression(int value) {
        this.value = value;
    }

    @Override
    public double opreate() {
        return value;
    }

}
