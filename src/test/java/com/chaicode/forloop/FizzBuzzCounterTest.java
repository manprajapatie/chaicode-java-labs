package com.chaicode.forloop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("For Loop - FizzBuzz Counter")
class FizzBuzzCounterTest {

    @Test
    void countUpTo15() {
        assertArrayEquals(new int[]{4, 2, 1}, FizzBuzzCounter.countFizzBuzz(15));
    }

    @Test
    void countUpTo5() {
        assertArrayEquals(new int[]{1, 1, 0}, FizzBuzzCounter.countFizzBuzz(5));
    }

    @Test
    void invalidN() {
        assertNull(FizzBuzzCounter.countFizzBuzz(0));
    }
}
