package builder.ex1;


/*
*  Builder 인터페이스를 사용해서 객체를 생성
*  각 부분을 조립하는 메서드를 제공
*
* */

public class OperationDirector {

    //두개의 수(100,20) 에 대한 사칙연산을 수행하고 그 결과를 출력
    /*
    * 구현방법
    * 1. 연산 결과 출력값을 builder객체로 조립
    * 2. 연산 결과 출력값을 첫번째 숫자, 연산자, 두번째 숫자 그리고 연산결과값으로 조립한다.
    * 3. 하위클래스에서 차이가 나는 부분은 연산자와 연산 결과값이다.
    *
    * */

    private AbstarctOperationBuilder builder;

    public OperationDirector(AbstarctOperationBuilder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildFirstNumber();
        builder.buildOperator();
        builder.buildSecondNumber();
        builder.buildAnswer();

        StringBuffer result = builder.getResult();
        print(result);
    }

    private void print(StringBuffer result) {
        System.out.println(result);
    }
}
