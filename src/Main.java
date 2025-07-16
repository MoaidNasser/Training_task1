public class Main {

    public int subtract(int a, int b) {
        int result;
        result = a - b;
        return result;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public int add(int a, int b) {
        return a + b;
    }

}