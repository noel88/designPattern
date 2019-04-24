package bridge.ex1;


// Abstraction 역할에다 기능을 추가한 역할
public class RefinedOperationAbstraction extends OperationAbstraction {

    public RefinedOperationAbstraction(IBaseOperationImplemetor impl) {
        super(impl);
    }

    public int sqrt(int a) {
        return (int) Math.sqrt(a);
    }

    public int pow(int a, int b) {
        return (int) Math.pow(a,b);
    }
}
