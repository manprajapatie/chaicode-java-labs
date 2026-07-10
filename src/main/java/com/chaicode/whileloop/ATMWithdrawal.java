package com.chaicode.whileloop;

/**
 * CityBank ATM Withdrawal
 *
 * <p>An ATM dispenses $20 bills only. Given the account balance and requested amount,
 * return how many $20 bills can actually be dispensed.
 *
 * <p>Rules:
 * <ul>
 *   <li>Repeatedly subtract 20 while balance allows and requested amount still needs bills</li>
 *   <li>If requested amount is not a multiple of 20, return -1</li>
 *   <li>If balance or requested amount is negative, return -1</li>
 *   <li>Account must keep at least $20 after each bill is dispensed</li>
 * </ul>
 *
 * @param balance account balance in dollars
 * @param requested amount requested in dollars
 * @return number of $20 bills dispensed, or -1 for invalid request
 */
public final class ATMWithdrawal {

    private ATMWithdrawal() {}

    public static int dispenseBills(int balance, int requested) {
        // Your code here
        return 0;
    }
}
