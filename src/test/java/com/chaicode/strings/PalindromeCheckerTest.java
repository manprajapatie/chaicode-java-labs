package com.chaicode.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Strings - Palindrome Checker")
class PalindromeCheckerTest {

    @Test
    void raceCar() {
        assertTrue(PalindromeChecker.isPalindrome("Race car"));
    }

    @Test
    void notPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
    }

    @Test
    void complexPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
