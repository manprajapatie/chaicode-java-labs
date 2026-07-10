package com.chaicode.variables;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Variables - Fitness Profile BMI")
class FitnessProfileTest {

    @Test
    void normalBmi() {
        assertEquals(24.2, FitnessProfile.calculateBmi(70, 170));
    }

    @Test
    void anotherBmi() {
        assertEquals(23.0, FitnessProfile.calculateBmi(65, 168));
    }

    @Test
    void invalidHeight() {
        assertEquals(-1.0, FitnessProfile.calculateBmi(70, 0));
    }

    @Test
    void invalidWeight() {
        assertEquals(-1.0, FitnessProfile.calculateBmi(-5, 170));
    }
}