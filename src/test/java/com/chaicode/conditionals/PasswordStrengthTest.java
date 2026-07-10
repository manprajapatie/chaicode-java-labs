package com.chaicode.conditionals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("09 - SecureApp: Password Strength Checker (9 pts)")
class PasswordStrengthTest {

    @Nested
    @DisplayName("Weak passwords (0–1 criteria)")
    class WeakPasswords {

        @Test
        void emptyString() {
            assertEquals("weak", PasswordStrength.checkPasswordStrength(""));
        }

        @Test
        void onlyLowercaseShort() {
            assertEquals("weak", PasswordStrength.checkPasswordStrength("abc"));
        }

        @Test
        void onlyNumbersShort() {
            assertEquals("weak", PasswordStrength.checkPasswordStrength("12345"));
        }

        @Test
        void nullPassword() {
            assertEquals("weak", PasswordStrength.checkPasswordStrength(null));
        }
    }

    @Nested
    @DisplayName("Medium passwords (2–3 criteria)")
    class MediumPasswords {

        @Test
        void eightCharsLowercase() {
            assertEquals("medium", PasswordStrength.checkPasswordStrength("abcdefgh"));
        }

        @Test
        void eightCharsUpperAndLower() {
            assertEquals("medium", PasswordStrength.checkPasswordStrength("Abcdefgh"));
        }

        @Test
        void shortMixedCriteria() {
            assertEquals("medium", PasswordStrength.checkPasswordStrength("ab1!"));
        }
    }

    @Nested
    @DisplayName("Strong passwords (4 criteria)")
    class StrongPasswords {

        @Test
        void fourCriteriaNoSpecial() {
            assertEquals("strong", PasswordStrength.checkPasswordStrength("Abcdefg1"));
        }

        @Test
        void fourCriteriaNoNumber() {
            assertEquals("strong", PasswordStrength.checkPasswordStrength("hello!World"));
        }
    }

    @Nested
    @DisplayName("Very strong passwords (all 5 criteria)")
    class VeryStrongPasswords {

        @Test
        void myPass() {
            assertEquals("very strong", PasswordStrength.checkPasswordStrength("MyP@ss1!"));
        }

        @Test
        void strongPass() {
            assertEquals("very strong", PasswordStrength.checkPasswordStrength("Str0ng!Pass"));
        }

        @Test
        void complexPwd() {
            assertEquals("very strong", PasswordStrength.checkPasswordStrength("C0mpl3x#Pwd"));
        }
    }
}
