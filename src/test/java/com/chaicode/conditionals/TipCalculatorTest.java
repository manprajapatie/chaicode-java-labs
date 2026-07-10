package com.chaicode.conditionals;

import com.chaicode.conditionals.model.TipResult;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("10 - TipEasy: Restaurant Tip Calculator (8 pts)")
class TipCalculatorTest {

    @Nested
    @DisplayName("Tip calculations by service rating")
    class TipCalculations {

        @Test
        void rating1() {
            TipResult result = TipCalculator.calculateTip(100, 1);
            assertEquals(5, result.tipPercentage());
            assertEquals(5.00, result.tipAmount(), 0.001);
            assertEquals(105.00, result.totalAmount(), 0.001);
        }

        @Test
        void rating2() {
            TipResult result = TipCalculator.calculateTip(80, 2);
            assertEquals(10, result.tipPercentage());
            assertEquals(8.00, result.tipAmount(), 0.001);
            assertEquals(88.00, result.totalAmount(), 0.001);
        }

        @Test
        void rating3() {
            TipResult result = TipCalculator.calculateTip(45.50, 3);
            assertEquals(15, result.tipPercentage());
            assertEquals(6.83, result.tipAmount(), 0.01);
            assertEquals(52.33, result.totalAmount(), 0.01);
        }

        @Test
        void rating4() {
            TipResult result = TipCalculator.calculateTip(50, 4);
            assertEquals(20, result.tipPercentage());
            assertEquals(10.00, result.tipAmount(), 0.001);
            assertEquals(60.00, result.totalAmount(), 0.001);
        }

        @Test
        void rating5() {
            TipResult result = TipCalculator.calculateTip(120, 5);
            assertEquals(25, result.tipPercentage());
            assertEquals(30.00, result.tipAmount(), 0.001);
            assertEquals(150.00, result.totalAmount(), 0.001);
        }
    }

    @Nested
    @DisplayName("Rounding")
    class Rounding {

        @Test
        void bill3333Rating3() {
            TipResult result = TipCalculator.calculateTip(33.33, 3);
            assertEquals(5.00, result.tipAmount(), 0.01);
            assertEquals(38.33, result.totalAmount(), 0.01);
        }
    }

    @Nested
    @DisplayName("Invalid input")
    class InvalidInput {

        @Test
        void billZero() {
            assertNull(TipCalculator.calculateTip(0, 3));
        }

        @Test
        void negativeBill() {
            assertNull(TipCalculator.calculateTip(-20, 4));
        }

        @Test
        void ratingZero() {
            assertNull(TipCalculator.calculateTip(50, 0));
        }

        @Test
        void ratingSix() {
            assertNull(TipCalculator.calculateTip(50, 6));
        }

        @Test
        void ratingNotInteger() {
            assertNull(TipCalculator.calculateTip(50, 3.5));
        }
    }
}
