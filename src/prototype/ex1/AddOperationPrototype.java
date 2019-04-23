package prototype.ex1;

public class AddOperationPrototype extends AbstractOperationPrototype {

    public AddOperationPrototype() {
        super();
    }

    public AddOperationPrototype(AddOperationPrototype operation) {
        super(operation);
    }

    @Override
    public AbstractOperationPrototype getClone() {
        return new AddOperationPrototype(this);
    }

    @Override
    protected int getAnswer(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    protected String getOperator() {
        return "+";
    }
}
