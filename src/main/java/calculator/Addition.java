package calculator;

public class Addition implements MathOperation {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}