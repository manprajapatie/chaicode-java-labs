package com.chaicode.conditionals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("04 - TrailBuddy: Weather Advisory (8 pts)")
class WeatherAdviceTest {

    @Nested
    @DisplayName("Extreme heat")
    class ExtremeHeat {

        @Test
        void fortyDegrees() {
            assertEquals("Too hot for hiking - stay indoors and hydrate",
                    WeatherAdvice.getWeatherAdvice(40, false));
        }

        @Test
        void thirtyFiveDegreesRaining() {
            assertEquals("Too hot for hiking - stay indoors and hydrate",
                    WeatherAdvice.getWeatherAdvice(35, true));
        }
    }

    @Nested
    @DisplayName("Warm weather (25–34°C)")
    class WarmWeather {

        @Test
        void twentyEightNotRaining() {
            assertEquals("Great weather for hiking - don't forget sunscreen",
                    WeatherAdvice.getWeatherAdvice(28, false));
        }

        @Test
        void twentyFiveRaining() {
            assertEquals("Warm but rainy - consider indoor activities",
                    WeatherAdvice.getWeatherAdvice(25, true));
        }

        @Test
        void thirtyNotRaining() {
            assertEquals("Great weather for hiking - don't forget sunscreen",
                    WeatherAdvice.getWeatherAdvice(30, false));
        }
    }

    @Nested
    @DisplayName("Mild weather (15–24°C)")
    class MildWeather {

        @Test
        void twentyNotRaining() {
            assertEquals("Perfect hiking weather - enjoy the trails",
                    WeatherAdvice.getWeatherAdvice(20, false));
        }

        @Test
        void eighteenRaining() {
            assertEquals("Cool and rainy - bring waterproof gear if hiking",
                    WeatherAdvice.getWeatherAdvice(18, true));
        }

        @Test
        void fifteenNotRaining() {
            assertEquals("Perfect hiking weather - enjoy the trails",
                    WeatherAdvice.getWeatherAdvice(15, false));
        }
    }

    @Nested
    @DisplayName("Cool weather (5–14°C)")
    class CoolWeather {

        @Test
        void tenNotRaining() {
            assertEquals("Chilly - wear layers for your hike",
                    WeatherAdvice.getWeatherAdvice(10, false));
        }

        @Test
        void sevenRaining() {
            assertEquals("Cold and wet - best to stay indoors",
                    WeatherAdvice.getWeatherAdvice(7, true));
        }

        @Test
        void fiveNotRaining() {
            assertEquals("Chilly - wear layers for your hike",
                    WeatherAdvice.getWeatherAdvice(5, false));
        }
    }

    @Nested
    @DisplayName("Cold weather (below 5°C)")
    class ColdWeather {

        @Test
        void threeDegrees() {
            assertEquals("Too cold - stay warm indoors",
                    WeatherAdvice.getWeatherAdvice(3, false));
        }

        @Test
        void minusFiveDegrees() {
            assertEquals("Too cold - stay warm indoors",
                    WeatherAdvice.getWeatherAdvice(-5, true));
        }

        @Test
        void zeroDegrees() {
            assertEquals("Too cold - stay warm indoors",
                    WeatherAdvice.getWeatherAdvice(0, false));
        }
    }
}
