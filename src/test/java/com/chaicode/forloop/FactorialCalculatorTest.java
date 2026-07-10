package com.chaicode.forloop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("For Loop - Factorial")
class FactorialCalculatorTest {

    @Test
    void zeroFactorial() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    void fiveFactorial() {
        assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    void negativeInput() {
        assertEquals(-1, FactorialCalculator.factorial(-3));
    }
}
