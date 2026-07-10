package com.chaicode.dowhileloop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Do-While Loop - Survey Average")
class SurveyAverageTest {

    @Test
    void averageRatings() {
        assertEquals(4.0, SurveyAverage.averageUntilSentinel(new int[]{5, 4, 3, -1}));
    }

    @Test
    void ignoresInvalid() {
        assertEquals(3.5, SurveyAverage.averageUntilSentinel(new int[]{3, 4, 3, 4, 99, -1}));
    }

    @Test
    void noValidRatings() {
        assertEquals(-1.0, SurveyAverage.averageUntilSentinel(new int[]{-1}));
    }
}
