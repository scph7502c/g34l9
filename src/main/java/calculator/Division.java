package calculator;

public class Division implements MathOperation {
    @Override
    public double calculate(double a, double b) {
        if (b == 0) {
            return -0;
        }
        return a / b;
    }
}