package bridge.ex1;


//1. Abstraction 역할의 인터페이스를 구현하기 위한 메소드를 규정하는 역할이다.
//2. 이런 기능의 구현을 위임을 받은 클래스로서, Abstraction 클래스의 기능을 하위 클래스에서 구현하도록 인터페이스로 선언되어 있으며 Bridge의 역할을 담당.
public interface IBaseOperationImplemetor {

    public abstract int add(int firstNumber, int secondNumber);

    public abstract int substract(int firstNumber, int secondNumber);

    public abstract int multiply(int firstNumber, int secondNumber);

    public abstract int divide(int firstNumber, int secondNumber);

}
