package com.chaicode.operators;

import com.chaicode.operators.model.TimeParts;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("Operators - Time Breakdown")
class TimeBreakdownTest {

    @Test
    void oneHour() {
        assertEquals(new TimeParts(1, 0, 0), TimeBreakdown.toTimeParts(3600));
    }

    @Test
    void mixedDuration() {
        assertEquals(new TimeParts(1, 2, 3), TimeBreakdown.toTimeParts(3723));
    }

    @Test
    void zeroSeconds() {
        assertEquals(new TimeParts(0, 0, 0), TimeBreakdown.toTimeParts(0));
    }

    @Test
    void negativeInput() {
        assertNull(TimeBreakdown.toTimeParts(-1));
    }
}
