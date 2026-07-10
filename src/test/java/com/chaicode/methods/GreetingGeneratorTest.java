package com.chaicode.methods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Methods - Greeting Generator")
class GreetingGeneratorTest {

    @Test
    void morning() {
        assertEquals("Good morning, Alex!", GreetingGenerator.greet("Alex", 9));
    }

    @Test
    void afternoon() {
        assertEquals("Good afternoon, Sam!", GreetingGenerator.greet("Sam", 14));
    }

    @Test
    void evening() {
        assertEquals("Good evening, Jo!", GreetingGenerator.greet("Jo", 19));
    }

    @Test
    void night() {
        assertEquals("Good night, Pat!", GreetingGenerator.greet("Pat", 23));
    }

    @Test
    void blankName() {
        assertEquals("Hello, guest!", GreetingGenerator.greet("  ", 10));
    }

    @Test
    void invalidHour() {
        assertEquals("Invalid hour", GreetingGenerator.greet("Alex", 25));
    }
}
