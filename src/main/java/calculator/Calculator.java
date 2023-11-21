package calculator;

public class Calculator {
    public double execute(MathOperation mathOperation, double a, double b) {
        return mathOperation.calculate(a, b);
    }
}