package org.example;

import calculator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        // given
        double a = 5;
        double b = 3;
        MathOperation addition = new Addition();

        // when
        double result = calculator.execute(addition, a, b);

        // then
        assertEquals(8, result);
    }

    @Test
    void testMultiplication() {
        // given
        double a = 4;
        double b = 6;
        MathOperation multiplication = new Multiplication();

        // when
        double result = calculator.execute(multiplication, a, b);

        // then
        assertEquals(24, result);
    }

    @Test
    void testDivisionByZero() {
        // given
        MathOperation division = new Division();
        double a = 10;
        double b = 0;

        // when
        double result = calculator.execute(division, a, b);

        // then
        assertEquals(0, result);
    }
}