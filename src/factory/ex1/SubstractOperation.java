package factory.ex1;

// 팩토리 메소드를 구현하여 concreateProduct 객체를 생성
public class SubstractOperation extends AbstractOperation {

    @Override
    protected AbstractOperator getOperator() {
        return new SubstractOperator();
    }
}
