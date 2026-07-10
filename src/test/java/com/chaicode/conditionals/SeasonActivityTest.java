package com.chaicode.conditionals;

import com.chaicode.conditionals.model.SeasonActivityResult;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("12 - WanderLust: Season & Activity Planner (8 pts)")
class SeasonActivityTest {

    @Nested
    @DisplayName("Winter (Dec, Jan, Feb)")
    class Winter {

        @Test
        void januaryMinusFive() {
            SeasonActivityResult result = SeasonActivity.getSeasonActivity(1, -5);
            assertEquals("Winter", result.season());
            assertEquals("skiing", result.activity());
        }

        @Test
        void februaryThree() {
            SeasonActivityResult result = SeasonActivity.getSeasonActivity(2, 3);
            assertEquals("Winter", result.season());
            assertEquals("ice skating", result.activity());
        }

        @Test
        void decemberZero() {
            SeasonActivityResult result = SeasonActivity.getSeasonActivity(12, 0);
            assertEquals("Winter", result.season());
            assertEquals("ice skating", result.activity());
        }
    }

    @Nested
    @DisplayName("Spring (Mar, Apr, May)")
    class Spring {

        @Test
        void aprilTwentyTwo() {
            SeasonActivityResult result = SeasonActivity.getSeasonActivity(4, 22);
            assertEquals("Spring", result.season());
            assertEquals("hiking", result.activity());
        }

        @Test
        void marchFifteen() {
            SeasonActivityResult result = SeasonActivity.getSeasonActivity(3, 15);
            assertEquals("Spring", result.season());
            assertEquals("museum visit", result.activity());
        }

        @Test
        void mayTwenty() {
            SeasonActivityResult result = SeasonActivity.getSeasonActivity(5, 20);
            assertEquals("Spring", result.season());
            assertEquals("museum visit", result.activity());
        }
    }

    @Nested
    @DisplayName("Summer (Jun, Jul, Aug)")
    class Summer {

        @Test
        void julyThirtyEight() {
            SeasonActivityResult result = SeasonActivity.getSeasonActivity(7, 38);
            assertEquals("Summer", result.season());
            assertEquals("swimming", result.activity());
        }

        @Test
        void juneTwentyEight() {
            SeasonActivityResult result = SeasonActivity.getSeasonActivity(6, 28);
            assertEquals("Summer", result.season());
            assertEquals("cycling", result.activity());
        }

        @Test
        void augustThirtyFive() {
            SeasonActivityResult result = SeasonActivity.getSeasonActivity(8, 35);
            assertEquals("Summer", result.season());
            assertEquals("cycling", result.activity());
        }
    }

    @Nested
    @DisplayName("Autumn (Sep, Oct, Nov)")
    class Autumn {

        @Test
        void octoberEighteen() {
            SeasonActivityResult result = SeasonActivity.getSeasonActivity(10, 18);
            assertEquals("Autumn", result.season());
            assertEquals("nature walk", result.activity());
        }

        @Test
        void novemberTen() {
            SeasonActivityResult result = SeasonActivity.getSeasonActivity(11, 10);
            assertEquals("Autumn", result.season());
            assertEquals("reading at a cafe", result.activity());
        }

        @Test
        void septemberFifteen() {
            SeasonActivityResult result = SeasonActivity.getSeasonActivity(9, 15);
            assertEquals("Autumn", result.season());
            assertEquals("reading at a cafe", result.activity());
        }
    }

    @Nested
    @DisplayName("Invalid month")
    class InvalidMonth {

        @Test
        void monthZero() {
            assertNull(SeasonActivity.getSeasonActivity(0, 20));
        }

        @Test
        void monthThirteen() {
            assertNull(SeasonActivity.getSeasonActivity(13, 20));
        }

        @Test
        void monthNegative() {
            assertNull(SeasonActivity.getSeasonActivity(-1, 15));
        }
    }
}
