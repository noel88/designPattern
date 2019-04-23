package builder.ex1;

/*
*  객체를 작성하기 위한 인터페이스를 정의한다.
*  객체의 각 부분을 만들기 위한 추상메서드를 선언.
*  마지막 결과를 얻기 위한 메서드를 정의
*
* */



public abstract class AbstarctOperationBuilder {

    protected StringBuffer result = new StringBuffer();

    private int firstNumber;
    private int secondNumber;

    public AbstarctOperationBuilder(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public abstract int operate(int firstNumber, int secondNumber);

    public abstract void buildOperator();

    public final void buildFirstNumber() {
        result.append(firstNumber);
    }

    public final void buildSecondNumber() {
        result.append(secondNumber);
    }

    public final void buildAnswer() {
        int answer = operate(firstNumber, secondNumber);
        result.append(" = " + answer);
    }

    public final StringBuffer getResult() {
        return result;
    }
}
