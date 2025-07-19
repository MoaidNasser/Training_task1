public class Main {


        public int mod(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot mod by zero");
            }
            return a % b;
        }

        //adding comment 1
        //adding  comment 2
        public double logOfNumber(double number) {
            if (number <= 0) {
                throw new IllegalArgumentException("Number must be positive for logarithm.");
            }
            return Math.log(number);
        }
}

