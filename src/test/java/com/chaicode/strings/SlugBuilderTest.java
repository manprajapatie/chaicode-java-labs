package com.chaicode.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Strings - Slug Builder")
class SlugBuilderTest {

    @Test
    void basicSlug() {
        assertEquals("hello-world-java-101", SlugBuilder.toSlug("Hello World! Java 101"));
    }

    @Test
    void multipleHyphens() {
        assertEquals("foo-bar", SlugBuilder.toSlug("foo---bar"));
    }

    @Test
    void emptyTitle() {
        assertEquals("", SlugBuilder.toSlug("   "));
    }
}
