package com.chaicode.whileloop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("While Loop - Digit Sum")
class DigitSumTest {

    @Test
    void sum123() {
        assertEquals(6, DigitSum.sumDigits(123));
    }

    @Test
    void sum905() {
        assertEquals(14, DigitSum.sumDigits(905));
    }

    @Test
    void zero() {
        assertEquals(0, DigitSum.sumDigits(0));
    }

    @Test
    void negative() {
        assertEquals(-1, DigitSum.sumDigits(-10));
    }
}
