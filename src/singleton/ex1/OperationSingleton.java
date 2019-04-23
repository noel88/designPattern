package singleton.ex1;




public class OperationSingleton {

    // 요구사항 - 두개의 수(100,20) 에 대한 사칙연산을 수행하고 그 결과를 출력
    // 구현방법 - 사칙연산기능을 가지고 있는 클래스로부터 단 하나의 인스턴스를 생성하여 수행

    public static final int ADD_OPREATION = 1;
    public static final int SUBSTRACT_OPERATION = 2;
    public static final int MULTIPLY_OPREATION = 3;
    public static final int DIVIDE_OPREATION = 4;

    private static OperationSingleton singleton = new OperationSingleton();

    private OperationSingleton() {
        super();
    }

    public static OperationSingleton getInstance() {
        return singleton;
    }

    public void operate(int operatorType, int firstNumber, int secondNumber) {
        int answer = 0;
        String operator = null;

        switch (operatorType) {
            case ADD_OPREATION:
                answer = firstNumber + secondNumber;
                operator = "+";
                break;
            case SUBSTRACT_OPERATION:
                answer = firstNumber - secondNumber;
                operator = "-";
                break;
            case MULTIPLY_OPREATION:
                answer = firstNumber * secondNumber;
                operator = "*";
                break;
            case DIVIDE_OPREATION:
                answer = firstNumber / secondNumber;
                operator = "/";
                break;
        }

        String result = firstNumber + operator + secondNumber + "=" + answer;
        print(result);
    }

    private void print(String result) {
        System.out.println(result);
    }
}
