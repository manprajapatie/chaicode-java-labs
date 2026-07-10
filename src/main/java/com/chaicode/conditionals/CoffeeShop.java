package com.chaicode.conditionals;

import com.chaicode.conditionals.model.CoffeeExtras;

/**
 * Bean &amp; Brew Cafe
 *
 * <p>Bean &amp; Brew, the cozy neighborhood cafe, wants to go digital! They
 * need a system that calculates the total price of a coffee order.
 * Here's their menu:
 *
 * <p>Base price by size:
 * <ul>
 *   <li>"small"  → $3.00</li>
 *   <li>"medium" → $4.00</li>
 *   <li>"large"  → $5.00</li>
 * </ul>
 *
 * <p>Add-on for coffee type:
 * <ul>
 *   <li>"regular"    → +$0.00</li>
 *   <li>"latte"      → +$1.00</li>
 *   <li>"cappuccino" → +$1.50</li>
 *   <li>"mocha"      → +$2.00</li>
 * </ul>
 *
 * <p>Optional extras:
 * <ul>
 *   <li>whippedCream → +$0.50 (if true)</li>
 *   <li>extraShot    → +$0.75 (if true)</li>
 * </ul>
 *
 * <p>Rules:
 * <ul>
 *   <li>If size is not "small", "medium", or "large", return -1</li>
 *   <li>If type is not "regular", "latte", "cappuccino", or "mocha", return -1</li>
 *   <li>Return the total price rounded to 2 decimal places</li>
 * </ul>
 *
 * @param size "small", "medium", or "large"
 * @param type "regular", "latte", "cappuccino", or "mocha"
 * @param extras optional extras
 * @return total price or -1 for invalid input
 */
public final class CoffeeShop {

    private CoffeeShop() {}

    public static double calculateCoffeePrice(String size, String type) {
        return calculateCoffeePrice(size, type, new CoffeeExtras());
    }

    public static double calculateCoffeePrice(String size, String type, CoffeeExtras extras) {
        if (size == null || type == null || extras == null) {
            return -1;
        }

        double basePrice;
        switch (size) {
            case "small" -> basePrice = 3.00;
            case "medium" -> basePrice = 4.00;
            case "large" -> basePrice = 5.00;
            default -> {
                return -1;
            }
        }

        double typeAddon;
        switch (type) {
            case "regular" -> typeAddon = 0.00;
            case "latte" -> typeAddon = 1.00;
            case "cappuccino" -> typeAddon = 1.50;
            case "mocha" -> typeAddon = 2.00;
            default -> {
                return -1;
            }
        }

        double total = basePrice + typeAddon;

        if (extras.whippedCream()) {
            total += 0.50;
        }
        if (extras.extraShot()) {
            total += 0.75;
        }

        return Math.round(total * 100.0) / 100.0;
    }
}
