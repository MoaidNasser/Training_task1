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

    public int multiply(int a, int b) {
        return a * b;
    }
    public int mod(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot mod by zero");
        }
        return a % b;
    }

    public double logOfNumber(double number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive for logarithm.");
        }
        return Math.log(number);
    }
}