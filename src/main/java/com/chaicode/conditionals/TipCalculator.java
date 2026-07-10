package com.chaicode.conditionals;

import com.chaicode.conditionals.model.TipResult;

/**
 * TipEasy - Restaurant Tip Calculator
 *
 * <p>You're building TipEasy, an app that helps diners calculate the right
 * tip based on how they'd rate their dining experience. No more awkward
 * mental math at the table!
 *
 * <p>Service Rating → Tip Percentage:
 * <ul>
 *   <li>1 (terrible)  → 5%</li>
 *   <li>2 (poor)      → 10%</li>
 *   <li>3 (okay)      → 15%</li>
 *   <li>4 (good)      → 20%</li>
 *   <li>5 (excellent) → 25%</li>
 * </ul>
 *
 * <p>Return a {@link TipResult} with:
 * <ul>
 *   <li>tipPercentage: the percentage as a number (e.g., 15)</li>
 *   <li>tipAmount: the calculated tip rounded to 2 decimal places</li>
 *   <li>totalAmount: bill + tip rounded to 2 decimal places</li>
 * </ul>
 *
 * <p>Rules:
 * <ul>
 *   <li>If billAmount is 0 or negative, return null</li>
 *   <li>If serviceRating is not an integer from 1 to 5, return null</li>
 * </ul>
 *
 * <p>Example:
 * {@code calculateTip(50, 4) → { tipPercentage: 20, tipAmount: 10.00, totalAmount: 60.00 }}
 *
 * @param billAmount the bill amount in dollars
 * @param serviceRating service rating from 1 to 5 (must be a whole number)
 * @return tip breakdown or null for invalid input
 */
public final class TipCalculator {

    private TipCalculator() {}

    public static TipResult calculateTip(double billAmount, double serviceRating) {
        // Your code here
        return null;
    }
}
