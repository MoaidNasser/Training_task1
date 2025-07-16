public class Main {


        public int mod(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot mod by zero");
            }
            return a % b;
        }
    }

