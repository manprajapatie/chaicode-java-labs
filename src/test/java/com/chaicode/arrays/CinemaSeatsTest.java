package com.chaicode.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Arrays - Cinema Seats")
class CinemaSeatsTest {

    @Test
    void countAvailableSeats() {
        int[][] seats = {
                {0, 1, 0},
                {1, 0, 0}
        };
        assertEquals(4, CinemaSeats.countAvailable(seats));
    }

    @Test
    void invalidGrid() {
        assertEquals(-1, CinemaSeats.countAvailable(null));
    }
}
