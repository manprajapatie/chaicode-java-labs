package com.chaicode.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("Arrays - Matrix Addition")
class MatrixAdditionTest {

    @Test
    void addMatrices() {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        assertArrayEquals(new int[][]{{6, 8}, {10, 12}}, MatrixAddition.add(a, b));
    }

    @Test
    void mismatchedDimensions() {
        assertNull(MatrixAddition.add(new int[][]{{1}}, new int[][]{{1, 2}}));
    }
}
