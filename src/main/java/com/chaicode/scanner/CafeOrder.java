package com.chaicode.scanner;

import java.util.Scanner;

/**
 * BeanStreet Cafe Order Terminal
 *
 * <p>Read line items from a Scanner until a line "DONE" is entered. Each line before DONE
 * is a price (double). Return the order total.
 *
 * <p>Example input:
 * <pre>
 * 4.50
 * 3.25
 * 2.00
 * DONE
 * </pre>
 * Total = 9.75
 *
 * <p>Rules:
 * <ul>
 *   <li>Skip blank lines</li>
 *   <li>Ignore negative prices</li>
 *   <li>If scanner is null, return 0.0</li>
 * </ul>
 *
 * @param scanner input source
 * @return order total
 */
public final class CafeOrder {

    private CafeOrder() {}

    public static double readOrderTotal(Scanner scanner) {
        // Your code here
        return 0.0;
    }
}
