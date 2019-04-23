package abstractFactory.ex1;

public class DoubleOperationFactory extends AbstractOperationFactory{

    @Override
    public AbstractOperationProduct createOperationProduct() {
        return new DoubleOperationProduct();
    }

    @Override
    public AbstractNumberOperandProduct createNumberOperandProduct(String value) {
        return new DoubleNumberOperandProduct(value);
    }
}
