package com.chaicode.conditionals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("03 - Ms. Parker: Grade Calculator (8 pts)")
class GradeCalculatorTest {

    @Nested
    @DisplayName("Basic grading without extra credit")
    class BasicGrading {

        @Test
        void score95() {
            assertEquals("A", GradeCalculator.calculateGrade(95, false));
        }

        @Test
        void score85() {
            assertEquals("B", GradeCalculator.calculateGrade(85, false));
        }

        @Test
        void score75() {
            assertEquals("C", GradeCalculator.calculateGrade(75, false));
        }

        @Test
        void score65() {
            assertEquals("D", GradeCalculator.calculateGrade(65, false));
        }

        @Test
        void score50() {
            assertEquals("F", GradeCalculator.calculateGrade(50, false));
        }
    }

    @Nested
    @DisplayName("Boundary values")
    class BoundaryValues {

        @Test
        void score90() {
            assertEquals("A", GradeCalculator.calculateGrade(90, false));
        }

        @Test
        void score89() {
            assertEquals("B", GradeCalculator.calculateGrade(89, false));
        }

        @Test
        void score80() {
            assertEquals("B", GradeCalculator.calculateGrade(80, false));
        }

        @Test
        void score70() {
            assertEquals("C", GradeCalculator.calculateGrade(70, false));
        }

        @Test
        void score60() {
            assertEquals("D", GradeCalculator.calculateGrade(60, false));
        }

        @Test
        void score59() {
            assertEquals("F", GradeCalculator.calculateGrade(59, false));
        }

        @Test
        void score0() {
            assertEquals("F", GradeCalculator.calculateGrade(0, false));
        }

        @Test
        void score100() {
            assertEquals("A", GradeCalculator.calculateGrade(100, false));
        }
    }

    @Nested
    @DisplayName("Extra credit (+5 points, capped at 100)")
    class ExtraCredit {

        @Test
        void score86WithExtraCredit() {
            assertEquals("A", GradeCalculator.calculateGrade(86, true));
        }

        @Test
        void score76WithExtraCredit() {
            assertEquals("B", GradeCalculator.calculateGrade(76, true));
        }

        @Test
        void score56WithExtraCredit() {
            assertEquals("D", GradeCalculator.calculateGrade(56, true));
        }

        @Test
        void score98WithExtraCreditCapped() {
            assertEquals("A", GradeCalculator.calculateGrade(98, true));
        }

        @Test
        void score100WithExtraCredit() {
            assertEquals("A", GradeCalculator.calculateGrade(100, true));
        }
    }

    @Nested
    @DisplayName("Invalid scores")
    class InvalidScores {

        @Test
        void scoreNegative1() {
            assertEquals("INVALID", GradeCalculator.calculateGrade(-1, false));
        }

        @Test
        void score101() {
            assertEquals("INVALID", GradeCalculator.calculateGrade(101, false));
        }

        @Test
        void score150WithExtraCredit() {
            assertEquals("INVALID", GradeCalculator.calculateGrade(150, true));
        }
    }
}
