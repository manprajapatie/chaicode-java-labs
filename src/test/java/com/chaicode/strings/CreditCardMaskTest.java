package com.chaicode.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Strings - Credit Card Mask")
class CreditCardMaskTest {

    @Test
    void maskFullCard() {
        assertEquals("************6467", CreditCardMask.mask("4532-1488-0343-6467"));
    }

    @Test
    void shortNumber() {
        assertEquals("****", CreditCardMask.mask("123"));
    }

    @Test
    void nullCard() {
        assertEquals("****", CreditCardMask.mask(null));
    }
}
