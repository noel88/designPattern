package factory.ex1;




// Product를 생성하는 팩토리 메서드를 선언한다.

public abstract class AbstractOperation {

    /*
    *  구현방법
    *  1. 팩토리 메서드 getOperator()로 다양한 연산자객체를 생성
    *  2. 연산자객체는 결과값을 만든다.
    *  3. 연산객체는 첫번째 숫자, 연산자, 두번째 숫자 그리고 연산객체가 만든 결과값으로 연산결과출력값을 만든다.
    * */
    private int firstNumber;
    private int secondNumber;

    public final void operate() {

        int firstNumber = getFirstNumber();
        int secondNumber = getSecondNumber();

        AbstractOperator operator = getOperator();

        String operatorDescription = operator.getDescription();

        int answer = operator.getAnswer(firstNumber, secondNumber);

        String result = firstNumber + operatorDescription + secondNumber + " = " + answer;

        print(result);
    }

    protected abstract AbstractOperator getOperator();

    public int getFirstNumber() {
        return firstNumber;
    }

    public final void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    private int getSecondNumber() {
        return secondNumber;
    }

    public final void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    private void print(String result) {
        System.out.println(result);
    }
}


