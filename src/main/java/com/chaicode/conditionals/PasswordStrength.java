package com.chaicode.conditionals;

/**
 * SecureApp Password Checker
 *
 * <p>You're building the signup page for SecureApp, a new productivity tool.
 * The product manager wants a password strength meter that gives users
 * real-time feedback as they type their password.
 *
 * <p>The checker evaluates 5 criteria:
 * <ol>
 *   <li>At least 8 characters long</li>
 *   <li>Contains at least one uppercase letter (A-Z)</li>
 *   <li>Contains at least one lowercase letter (a-z)</li>
 *   <li>Contains at least one number (0-9)</li>
 *   <li>Contains at least one special character (!@#$%^&amp;*()_+-=[]{}|;:,.&lt;&gt;?)</li>
 * </ol>
 *
 * <p>Strength levels based on how many criteria are met:
 * <ul>
 *   <li>0–1 criteria → "weak"</li>
 *   <li>2–3 criteria → "medium"</li>
 *   <li>4 criteria   → "strong"</li>
 *   <li>All 5        → "very strong"</li>
 * </ul>
 *
 * <p>Rules:
 * <ul>
 *   <li>Empty string or null → "weak"</li>
 * </ul>
 *
 * @param password the password to evaluate
 * @return "weak", "medium", "strong", or "very strong"
 */
public final class PasswordStrength {

    private PasswordStrength() {}

    public static String checkPasswordStrength(String password) {
        // Your code here
        return "";
    }
}
