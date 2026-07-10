package com.chaicode.scanner;

import java.util.Scanner;

/**
 * PocketCalc REPL
 *
 * <p>Read two numbers and an operator from a Scanner and return the result.
 * Input order: first number (double), operator (+, -, *, /), second number (double).
 *
 * <p>Rules:
 * <ul>
 *   <li>Division by zero returns Double.NaN</li>
 *   <li>Unknown operator returns Double.NaN</li>
 *   <li>If scanner is null, return Double.NaN</li>
 * </ul>
 *
 * @param scanner input source
 * @return calculation result
 */
public final class SimpleCalculator {

    private SimpleCalculator() {}

    public static double calculate(Scanner scanner) {
        // Your code here
        return 0.0;
    }
}
