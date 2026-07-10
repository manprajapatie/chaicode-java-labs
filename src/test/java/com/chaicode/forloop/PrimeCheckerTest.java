package com.chaicode.forloop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("For Loop - Prime Checker")
class PrimeCheckerTest {

    @Test
    void twoIsPrime() {
        assertTrue(PrimeChecker.isPrime(2));
    }

    @Test
    void seventeenIsPrime() {
        assertTrue(PrimeChecker.isPrime(17));
    }

    @Test
    void fourIsNotPrime() {
        assertFalse(PrimeChecker.isPrime(4));
    }

    @Test
    void oneIsNotPrime() {
        assertFalse(PrimeChecker.isPrime(1));
    }
}
