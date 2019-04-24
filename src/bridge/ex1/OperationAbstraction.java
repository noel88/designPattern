package bridge.ex1;

/*
* 1. Implemetor 역할의 메소드를 사용해서 기본적인 기능만 기술되어 있는 클래스
* 2. 이 인스턴스는 Implemetor 역할을 가지고 있다.
* 3. 기본적인 기능만이 서술되어 있고 여기서 기술되어 있는 기능들이 바로 bridge를 통해서 기능을 위임받은 클래스와 교감할 수 있다.
*
* */
public class OperationAbstraction {

    private IBaseOperationImplemetor impl;

    public OperationAbstraction(IBaseOperationImplemetor impl) {
        this.impl = impl;
    }

    public int add(int firstNumber, int secondNumber) {
        return this.impl.add(firstNumber, secondNumber);
    }

    public int substract(int firstNumber, int secondNumber) {
        return this.impl.substract(firstNumber, secondNumber);
    }

    public int multiply(int firstNumber, int secondNumber) {
        return this.impl.multiply(firstNumber, secondNumber);
    }

    public int divide(int firstNumber, int secondNumber) {
        return this.impl.divide(firstNumber, secondNumber);
    }

}
