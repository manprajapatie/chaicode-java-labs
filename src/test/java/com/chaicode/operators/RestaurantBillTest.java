package com.chaicode.operators;

import com.chaicode.operators.model.TimeParts;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("Operators - Restaurant Bill")
class RestaurantBillTest {

    @Test
    void standardBill() {
        assertEquals(124.2, RestaurantBill.calculateTotal(100.0));
    }

    @Test
    void smallBill() {
        assertEquals(15.53, RestaurantBill.calculateTotal(12.50));
    }

    @Test
    void negativeSubtotal() {
        assertEquals(-1.0, RestaurantBill.calculateTotal(-10.0));
    }
}
