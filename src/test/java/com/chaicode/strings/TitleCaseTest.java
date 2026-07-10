package com.chaicode.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Strings - Title Case")
class TitleCaseTest {

    @Test
    void formatHeadline() {
        assertEquals("The Quick Brown Fox", TitleCase.format("the quick BROWN fox"));
    }

    @Test
    void extraSpaces() {
        assertEquals("Hello World", TitleCase.format("  hello   world  "));
    }

    @Test
    void nullInput() {
        assertEquals("", TitleCase.format(null));
    }
}
