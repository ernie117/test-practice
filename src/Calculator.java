class Calculator {

    static int sum(int operandOne, int operandTwo) {
        return operandOne + operandTwo;
    }

    static int subtract(int operandOne, int operandTwo) {
        return operandOne - operandTwo;
    }

    static int divide(int operandOne, int operandTwo) {
        return operandOne / operandTwo;
    }

    static int multiply(int operandOne, int operandTwo) {
        return operandOne * operandTwo;
    }

//    static int complicatedMethod(int operandOne, int operandTwo) {
//        int firstResult = Calculator.sum(operandOne, operandTwo);
//
//        int secondResult = Calculator.subtract(firstResult, operandOne);
//
//        int thirdResult = Calculator.division(secondResult, operandTwo);
//
//        int finalResult = Calculator.multiply(secondResult, thirdResult);
//
//        return finalResult;
//    }
}
