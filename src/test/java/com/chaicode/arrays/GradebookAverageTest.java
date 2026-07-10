package com.chaicode.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("Arrays - Gradebook Average")
class GradebookAverageTest {

    @Test
    void studentAverages() {
        int[][] grades = {
                {80, 90, 70},
                {60, 60, 60}
        };
        assertArrayEquals(new double[]{80.0, 60.0}, GradebookAverage.studentAverages(grades));
    }

    @Test
    void unevenRows() {
        assertNull(GradebookAverage.studentAverages(new int[][]{{80, 90}, {70}}));
    }
}
