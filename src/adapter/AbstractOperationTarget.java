package adapter;


// 클라이언트에게 필요한 메서드를 제공
public abstract class AbstractOperationTarget {

    public abstract int operate(int firstNumber, int secondNumber);
}
