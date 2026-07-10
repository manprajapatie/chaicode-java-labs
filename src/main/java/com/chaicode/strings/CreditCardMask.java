package com.chaicode.strings;

/**
 * PayShield Card Masker
 *
 * <p>Mask a credit card number for display, showing only the last 4 digits.
 * Use StringBuilder to build the result.
 *
 * <p>Rules:
 * <ul>
 *   <li>Remove all spaces and hyphens from input first</li>
 *   <li>If cleaned length is less than 4, return "****"</li>
 *   <li>Otherwise return (length-4) asterisks followed by last 4 digits</li>
 *   <li>If cardNumber is null, return "****"</li>
 * </ul>
 *
 * <p>Example: "4532-1488-0343-6467" → "************6467"
 *
 * @param cardNumber card number string
 * @return masked card number
 */
public final class CreditCardMask {

    private CreditCardMask() {}

    public static String mask(String cardNumber) {
        // Your code here
        return "";
    }
}
