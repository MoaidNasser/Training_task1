public class Main {


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

