package com.chaicode.conditionals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("02 - SafeDrive: Traffic Light Simulator (8 pts)")
class TrafficLightTest {

    @Nested
    @DisplayName("Standard signals")
    class StandardSignals {

        @Test
        void green() {
            assertEquals("GO", TrafficLight.getTrafficAction("green"));
        }

        @Test
        void yellow() {
            assertEquals("SLOW DOWN", TrafficLight.getTrafficAction("yellow"));
        }

        @Test
        void red() {
            assertEquals("STOP", TrafficLight.getTrafficAction("red"));
        }

        @Test
        void flashingRed() {
            assertEquals("STOP AND PROCEED WITH CAUTION", TrafficLight.getTrafficAction("flashing red"));
        }
    }

    @Nested
    @DisplayName("Case insensitivity")
    class CaseInsensitivity {

        @Test
        void greenUppercase() {
            assertEquals("GO", TrafficLight.getTrafficAction("GREEN"));
        }

        @Test
        void yellowMixedCase() {
            assertEquals("SLOW DOWN", TrafficLight.getTrafficAction("Yellow"));
        }

        @Test
        void redUppercase() {
            assertEquals("STOP", TrafficLight.getTrafficAction("RED"));
        }

        @Test
        void flashingRedUppercase() {
            assertEquals("STOP AND PROCEED WITH CAUTION", TrafficLight.getTrafficAction("FLASHING RED"));
        }
    }

    @Nested
    @DisplayName("Invalid signals")
    class InvalidSignals {

        @Test
        void blue() {
            assertEquals("INVALID SIGNAL", TrafficLight.getTrafficAction("blue"));
        }

        @Test
        void go() {
            assertEquals("INVALID SIGNAL", TrafficLight.getTrafficAction("go"));
        }

        @Test
        void emptyString() {
            assertEquals("INVALID SIGNAL", TrafficLight.getTrafficAction(""));
        }
    }
}
