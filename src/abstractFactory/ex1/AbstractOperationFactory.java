package abstractFactory.ex1;

public abstract class AbstractOperationFactory {

    public abstract AbstractOperationProduct createOperationProduct();

    public abstract AbstractNumberOperandProduct createNumberOperandProduct(String value);
}
