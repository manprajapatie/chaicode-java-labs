package com.chaicode.conditionals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("11 - City Central: Parking Fee Calculator (9 pts)")
class ParkingFeeTest {

    @Nested
    @DisplayName("Car rates")
    class CarRates {

        @Test
        void oneHour() {
            assertEquals(5, ParkingFee.calculateParkingFee(1, "car"));
        }

        @Test
        void threeHours() {
            assertEquals(11, ParkingFee.calculateParkingFee(3, "car"));
        }

        @Test
        void fiveHours() {
            assertEquals(17, ParkingFee.calculateParkingFee(5, "car"));
        }

        @Test
        void tenHoursCapped() {
            assertEquals(30, ParkingFee.calculateParkingFee(10, "car"));
        }
    }

    @Nested
    @DisplayName("Motorcycle rates")
    class MotorcycleRates {

        @Test
        void oneHour() {
            assertEquals(3, ParkingFee.calculateParkingFee(1, "motorcycle"));
        }

        @Test
        void fourHours() {
            assertEquals(9, ParkingFee.calculateParkingFee(4, "motorcycle"));
        }

        @Test
        void twelveHoursCapped() {
            assertEquals(18, ParkingFee.calculateParkingFee(12, "motorcycle"));
        }
    }

    @Nested
    @DisplayName("Bus rates")
    class BusRates {

        @Test
        void oneHour() {
            assertEquals(10, ParkingFee.calculateParkingFee(1, "bus"));
        }

        @Test
        void threeHours() {
            assertEquals(24, ParkingFee.calculateParkingFee(3, "bus"));
        }

        @Test
        void tenHoursCapped() {
            assertEquals(60, ParkingFee.calculateParkingFee(10, "bus"));
        }
    }

    @Nested
    @DisplayName("Partial hours (round up)")
    class PartialHours {

        @Test
        void halfHourCar() {
            assertEquals(5, ParkingFee.calculateParkingFee(0.5, "car"));
        }

        @Test
        void onePointOneHoursCar() {
            assertEquals(8, ParkingFee.calculateParkingFee(1.1, "car"));
        }

        @Test
        void twoPointFiveHoursMotorcycle() {
            assertEquals(7, ParkingFee.calculateParkingFee(2.5, "motorcycle"));
        }
    }

    @Nested
    @DisplayName("Invalid input")
    class InvalidInput {

        @Test
        void zeroHours() {
            assertEquals(-1, ParkingFee.calculateParkingFee(0, "car"));
        }

        @Test
        void negativeHours() {
            assertEquals(-1, ParkingFee.calculateParkingFee(-2, "car"));
        }

        @Test
        void unknownVehicle() {
            assertEquals(-1, ParkingFee.calculateParkingFee(3, "truck"));
        }
    }
}
