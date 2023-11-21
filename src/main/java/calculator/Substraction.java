package calculator;

class Subtraction implements MathOperation {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}