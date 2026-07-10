package com.chaicode.methods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Methods - Temperature Converter")
class TemperatureConverterTest {

    @Test
    void celsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0.0));
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100.0));
    }

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32.0));
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212.0));
    }
}
