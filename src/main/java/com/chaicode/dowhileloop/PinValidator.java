package com.chaicode.dowhileloop;

/**
 * SecureDoor PIN Entry
 *
 * <p>A smart lock allows up to 3 PIN attempts. Given an array of attempted PINs and the correct PIN,
 * return whether access was granted.
 *
 * <p>Rules:
 * <ul>
 *   <li>Check attempts in order using a do-while loop (at least one attempt if array non-empty)</li>
 *   <li>Stop on first correct PIN and return true</li>
 *   <li>After 3 attempts (or array exhausted), return false</li>
 *   <li>If attempts array is null or empty, return false</li>
 * </ul>
 *
 * @param attempts PIN attempts in order
 * @param correctPin the correct PIN
 * @return true if unlocked, false otherwise
 */
public final class PinValidator {

    private PinValidator() {}

    public static boolean validatePin(int[] attempts, int correctPin) {
        // Your code here
        return false;
    }
}
