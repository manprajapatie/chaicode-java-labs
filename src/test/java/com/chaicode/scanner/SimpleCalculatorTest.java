package com.chaicode.scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Scanner - Simple Calculator")
class SimpleCalculatorTest {

    @Test
    void addition() {
        var scanner = new Scanner("10\n+\n5\n");
        assertEquals(15.0, SimpleCalculator.calculate(scanner));
    }

    @Test
    void division() {
        var scanner = new Scanner("20\n/\n4\n");
        assertEquals(5.0, SimpleCalculator.calculate(scanner));
    }

    @Test
    void divideByZero() {
        var scanner = new Scanner("10\n/\n0\n");
        assertTrue(Double.isNaN(SimpleCalculator.calculate(scanner)));
    }
}
