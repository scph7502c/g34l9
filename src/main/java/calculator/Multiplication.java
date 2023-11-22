package calculator;

public class Multiplication implements MathOperation {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}