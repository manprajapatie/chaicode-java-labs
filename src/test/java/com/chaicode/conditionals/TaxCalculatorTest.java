package com.chaicode.conditionals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("08 - Sam's Tax Calculator: Progressive Brackets (9 pts)")
class TaxCalculatorTest {

    @Nested
    @DisplayName("Bracket 1: $0 – $10,000 (0% tax)")
    class Bracket1 {

        @Test
        void income0() {
            assertEquals(0, TaxCalculator.calculateTax(0));
        }

        @Test
        void income5000() {
            assertEquals(0, TaxCalculator.calculateTax(5000));
        }

        @Test
        void income10000() {
            assertEquals(0, TaxCalculator.calculateTax(10000));
        }
    }

    @Nested
    @DisplayName("Bracket 2: $10,001 – $30,000 (10% on amount above $10k)")
    class Bracket2 {

        @Test
        void income15000() {
            assertEquals(500, TaxCalculator.calculateTax(15000));
        }

        @Test
        void income20000() {
            assertEquals(1000, TaxCalculator.calculateTax(20000));
        }

        @Test
        void income30000() {
            assertEquals(2000, TaxCalculator.calculateTax(30000));
        }
    }

    @Nested
    @DisplayName("Bracket 3: $30,001 – $70,000 ($2,000 + 20% on amount above $30k)")
    class Bracket3 {

        @Test
        void income40000() {
            assertEquals(4000, TaxCalculator.calculateTax(40000));
        }

        @Test
        void income50000() {
            assertEquals(6000, TaxCalculator.calculateTax(50000));
        }

        @Test
        void income70000() {
            assertEquals(10000, TaxCalculator.calculateTax(70000));
        }
    }

    @Nested
    @DisplayName("Bracket 4: Over $70,000 ($10,000 + 30% on amount above $70k)")
    class Bracket4 {

        @Test
        void income80000() {
            assertEquals(13000, TaxCalculator.calculateTax(80000));
        }

        @Test
        void income100000() {
            assertEquals(19000, TaxCalculator.calculateTax(100000));
        }
    }

    @Nested
    @DisplayName("Edge cases")
    class EdgeCases {

        @Test
        void negativeIncome() {
            assertEquals(0, TaxCalculator.calculateTax(-5000));
        }

        @Test
        void income10001() {
            assertEquals(0.10, TaxCalculator.calculateTax(10001), 0.001);
        }
    }
}
