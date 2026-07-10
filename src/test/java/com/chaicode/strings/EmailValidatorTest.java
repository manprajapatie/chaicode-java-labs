package com.chaicode.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Strings - Email Validator")
class EmailValidatorTest {

    @Test
    void validEmail() {
        assertTrue(EmailValidator.isValid("user@example.com"));
    }

    @Test
    void missingAt() {
        assertFalse(EmailValidator.isValid("userexample.com"));
    }

    @Test
    void shortTld() {
        assertFalse(EmailValidator.isValid("user@example.c"));
    }

    @Test
    void emptyLocal() {
        assertFalse(EmailValidator.isValid("@example.com"));
    }
}
