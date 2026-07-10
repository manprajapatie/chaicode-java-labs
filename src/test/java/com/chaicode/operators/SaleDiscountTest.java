package com.chaicode.operators;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Operators - Sale Discount")
class SaleDiscountTest {

    @Test
    void twentyPercentOff() {
        assertEquals(80.0, SaleDiscount.applyDiscount(100.0, 20));
    }

    @Test
    void fiftyPercentOff() {
        assertEquals(49.99, SaleDiscount.applyDiscount(99.98, 50));
    }

    @Test
    void invalidDiscount() {
        assertEquals(-1.0, SaleDiscount.applyDiscount(100.0, 150));
    }

    @Test
    void negativePrice() {
        assertEquals(-1.0, SaleDiscount.applyDiscount(-50.0, 10));
    }
}
