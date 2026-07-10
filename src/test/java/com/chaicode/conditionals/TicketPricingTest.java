package com.chaicode.conditionals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("01 - Starlight Cinema: Ticket Pricing (8 pts)")
class TicketPricingTest {

    @Nested
    @DisplayName("Weekday prices by age group")
    class WeekdayPrices {

        @Test
        void childAge5Weekday() {
            assertEquals(8, TicketPricing.getTicketPrice(5, false));
        }

        @Test
        void childBoundaryAge12Weekday() {
            assertEquals(8, TicketPricing.getTicketPrice(12, false));
        }

        @Test
        void teenAge15Weekday() {
            assertEquals(12, TicketPricing.getTicketPrice(15, false));
        }

        @Test
        void teenBoundaryAge13Weekday() {
            assertEquals(12, TicketPricing.getTicketPrice(13, false));
        }

        @Test
        void adultAge30Weekday() {
            assertEquals(15, TicketPricing.getTicketPrice(30, false));
        }

        @Test
        void adultBoundariesAge18And59Weekday() {
            assertEquals(15, TicketPricing.getTicketPrice(18, false));
            assertEquals(15, TicketPricing.getTicketPrice(59, false));
        }

        @Test
        void seniorAge70Weekday() {
            assertEquals(10, TicketPricing.getTicketPrice(70, false));
        }

        @Test
        void seniorBoundaryAge60Weekday() {
            assertEquals(10, TicketPricing.getTicketPrice(60, false));
        }

        @Test
        void babyAge0Weekday() {
            assertEquals(8, TicketPricing.getTicketPrice(0, false));
        }
    }

    @Nested
    @DisplayName("Weekend surcharge (+$3)")
    class WeekendSurcharge {

        @Test
        void childWeekend() {
            assertEquals(11, TicketPricing.getTicketPrice(10, true));
        }

        @Test
        void teenWeekend() {
            assertEquals(15, TicketPricing.getTicketPrice(16, true));
        }

        @Test
        void adultWeekend() {
            assertEquals(18, TicketPricing.getTicketPrice(35, true));
        }

        @Test
        void seniorWeekend() {
            assertEquals(13, TicketPricing.getTicketPrice(75, true));
        }
    }

    @Nested
    @DisplayName("Invalid input")
    class InvalidInput {

        @Test
        void negativeAge() {
            assertEquals(-1, TicketPricing.getTicketPrice(-1, false));
        }

        @Test
        void negativeAgeWeekend() {
            assertEquals(-1, TicketPricing.getTicketPrice(-5, true));
        }
    }
}
