package factory.ex1;


// 팩토리 메소드로 생성될 객체의 인터페이스를 정의

public abstract class AbstractOperator {

    protected abstract int getAnswer(int firstNumber, int secondNumber);

    public abstract String getDescription();

}
