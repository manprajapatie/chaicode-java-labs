package com.chaicode.whileloop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("While Loop - Reverse Digits")
class ReverseDigitsTest {

    @Test
    void reverse123() {
        assertEquals(321, ReverseDigits.reverse(123));
    }

    @Test
    void reverse1000() {
        assertEquals(1, ReverseDigits.reverse(1000));
    }

    @Test
    void zero() {
        assertEquals(0, ReverseDigits.reverse(0));
    }

    @Test
    void negative() {
        assertEquals(-1, ReverseDigits.reverse(-42));
    }
}
