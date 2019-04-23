package prototype.ex1;

import java.util.HashMap;

public class Client {

    private AbstractOperationPrototype operationPrototype;

    private HashMap<String, AbstractOperationPrototype> operationPrototpyeHashMap;

    public Client() {
        super();

        initOperationMap();
    }

    public void operate() {
        operationPrototype.operate();
    }

    public void setOperation(String operator, int firstNumber, int secondNumber) {
        operationPrototype = getOperationClone(operator);

        operationPrototype.setFirstNumber(firstNumber);
        operationPrototype.setSecondNumber(secondNumber);
    }

    private void initOperationMap() {
        operationPrototpyeHashMap = new HashMap<String, AbstractOperationPrototype>();

        operationPrototpyeHashMap.put("+", new AddOperationPrototype());
        operationPrototpyeHashMap.put("-", new SubstractOperationPrototype());
        operationPrototpyeHashMap.put("*", new MultiplyOperationPrototype());
        operationPrototpyeHashMap.put("/", new DivideOperationPrototype());
    }

    private AbstractOperationPrototype getOperationClone(String operator) {
        AbstractOperationPrototype operation = operationPrototpyeHashMap.get(operator);
        return operation.getClone();
    }

    public static void main(String[] args) {
        Client client = new Client();

        int firstNumber = 100;
        int secondNumber = 20;

        String[] operators = {"+", "-", "*", "/"};

        for (int i = 0; i < operators.length; i++) {
            client.setOperation(operators[i], firstNumber, secondNumber);
            client.operate();
        }
    }

}
