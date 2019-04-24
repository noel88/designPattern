package composite.ex1;

public class NumberExpression extends AbstractExpression {

    private int value;

    public NumberExpression(int value) {
        this.value = value;
    }

    @Override   
    public int operate() {
        return value;
    }

}
