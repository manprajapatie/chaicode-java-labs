package com.chaicode.conditionals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("06 - ShopSwift: Shipping Calculator (9 pts)")
class ShippingCalculatorTest {

    @Nested
    @DisplayName("Domestic shipping (US)")
    class DomesticShipping {

        @Test
        void halfKg() {
            assertEquals(5, ShippingCalculator.calculateShipping(0.5, "US", 20));
        }

        @Test
        void oneKg() {
            assertEquals(5, ShippingCalculator.calculateShipping(1, "US", 30));
        }

        @Test
        void threeKg() {
            assertEquals(10, ShippingCalculator.calculateShipping(3, "US", 40));
        }

        @Test
        void fiveKg() {
            assertEquals(10, ShippingCalculator.calculateShipping(5, "US", 25));
        }

        @Test
        void eightKg() {
            assertEquals(15, ShippingCalculator.calculateShipping(8, "US", 30));
        }
    }

    @Nested
    @DisplayName("International shipping")
    class InternationalShipping {

        @Test
        void halfKgUk() {
            assertEquals(15, ShippingCalculator.calculateShipping(0.5, "UK", 20));
        }

        @Test
        void threeKgIndia() {
            assertEquals(25, ShippingCalculator.calculateShipping(3, "IN", 50));
        }

        @Test
        void sevenKgGermany() {
            assertEquals(40, ShippingCalculator.calculateShipping(7, "DE", 80));
        }
    }

    @Nested
    @DisplayName("Free shipping")
    class FreeShipping {

        @Test
        void domesticOver50() {
            assertEquals(0, ShippingCalculator.calculateShipping(3, "US", 51));
        }

        @Test
        void domesticExactly50NotFree() {
            assertEquals(10, ShippingCalculator.calculateShipping(3, "US", 50));
        }

        @Test
        void internationalOver100() {
            assertEquals(0, ShippingCalculator.calculateShipping(5, "UK", 101));
        }

        @Test
        void internationalExactly100NotFree() {
            assertEquals(25, ShippingCalculator.calculateShipping(5, "UK", 100));
        }
    }

    @Nested
    @DisplayName("Invalid input")
    class InvalidInput {

        @Test
        void weightZero() {
            assertEquals(-1, ShippingCalculator.calculateShipping(0, "US", 30));
        }

        @Test
        void negativeWeight() {
            assertEquals(-1, ShippingCalculator.calculateShipping(-2, "US", 30));
        }

        @Test
        void negativeOrderTotal() {
            assertEquals(-1, ShippingCalculator.calculateShipping(2, "US", -10));
        }
    }
}
