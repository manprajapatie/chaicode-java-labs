package com.chaicode.dowhileloop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Do-While Loop - PIN Validator")
class PinValidatorTest {

    @Test
    void correctOnSecondAttempt() {
        assertTrue(PinValidator.validatePin(new int[]{1111, 4521, 9999}, 4521));
    }

    @Test
    void allWrong() {
        assertFalse(PinValidator.validatePin(new int[]{1111, 2222, 3333}, 4521));
    }

    @Test
    void emptyAttempts() {
        assertFalse(PinValidator.validatePin(new int[]{}, 4521));
    }
}
