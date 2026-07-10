package com.chaicode.methods;

/**
 * HomeLoan EMI Calculator
 *
 * <p>Calculate monthly EMI (Equated Monthly Installment) for a home loan.
 *
 * <p>Formula: EMI = P × r × (1+r)^n / ((1+r)^n - 1)
 * where P = principal, r = monthly interest rate (annualRate/12/100), n = tenureMonths
 *
 * <p>Rules:
 * <ul>
 *   <li>Round EMI to 2 decimal places</li>
 *   <li>If principal, annualRate, or tenureMonths is zero or negative, return -1.0</li>
 *   <li>If annualRate is 0, EMI = principal / tenureMonths</li>
 * </ul>
 *
 * @param principal loan amount
 * @param annualRate annual interest rate percent (e.g. 8.5 for 8.5%)
 * @param tenureMonths loan tenure in months
 * @return monthly EMI, or -1.0 for invalid input
 */
public final class LoanEMI {

    private LoanEMI() {}

    public static double calculateEmi(double principal, double annualRate, int tenureMonths) {
        // Your code here
        return 0.0;
    }
}
