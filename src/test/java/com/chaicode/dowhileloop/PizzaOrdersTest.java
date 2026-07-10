package com.chaicode.dowhileloop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Do-While Loop - Pizza Orders")
class PizzaOrdersTest {

    @Test
    void countThreeOrders() {
        assertEquals(3, PizzaOrders.countOrders(new String[]{"MARGHERITA", "PEPPERONI", "VEGGIE", "DONE"}));
    }

    @Test
    void emptyOrders() {
        assertEquals(0, PizzaOrders.countOrders(new String[]{"DONE"}));
    }

    @Test
    void nullOrders() {
        assertEquals(0, PizzaOrders.countOrders(null));
    }
}
