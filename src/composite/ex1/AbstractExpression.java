package composite.ex1;

/*
* 1. component 인터페이스를 구현해야 한다.
* 2. 다른 요소를 가질 수 없다.
* 3. component 인터페이스 중에 add(), remove(), getChild() 같은 메서드는 필요하지 않아도 상속받거나 구현해야 한다.
* 4. composite 객체의 부품으로 설정한다.
*
* */

public abstract class AbstractExpression {

    public abstract int operate();

}
