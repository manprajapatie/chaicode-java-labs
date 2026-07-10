package com.chaicode.forloop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("For Loop - Shopping Cart Total")
class ShoppingCartTotalTest {

    @Test
    void sumPrices() {
        assertEquals(45.50, ShoppingCartTotal.calculateTotal(new double[]{10.0, 20.5, 15.0}));
    }

    @Test
    void ignoresNegative() {
        assertEquals(10.0, ShoppingCartTotal.calculateTotal(new double[]{10.0, -5.0}));
    }

    @Test
    void emptyCart() {
        assertEquals(0.0, ShoppingCartTotal.calculateTotal(new double[]{}));
    }
}
