package com.chaicode.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("Arrays - Classroom Stats")
class ClassroomStatsTest {

    @Test
    void analyzeScores() {
        var result = ClassroomStats.analyze(new int[]{80, 40, 90, 35});
        assertNotNull(result);
        assertEquals(61.3, result.average());
        assertEquals(90, result.highest());
        assertEquals(3, result.passingCount());
    }

    @Test
    void emptyArray() {
        assertNull(ClassroomStats.analyze(new int[]{}));
    }
}
