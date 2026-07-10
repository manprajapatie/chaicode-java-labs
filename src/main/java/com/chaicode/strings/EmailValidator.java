package com.chaicode.strings;

/**
 * MailGuard Email Validator
 *
 * <p>Basic email validation for a signup form.
 *
 * <p>Rules — email is valid only if ALL are true:
 * <ul>
 *   <li>Not null, not empty after trim</li>
 *   <li>Contains exactly one '@'</li>
 *   <li>Local part (before @) is non-empty</li>
 *   <li>Domain part (after @) contains at least one '.'</li>
 *   <li>Domain part after the last '.' has at least 2 characters</li>
 * </ul>
 *
 * @param email email address
 * @return true if valid
 */
public final class EmailValidator {

    private EmailValidator() {}

    public static boolean isValid(String email) {
        // Your code here
        return false;
    }
}
