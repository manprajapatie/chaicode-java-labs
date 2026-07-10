package com.chaicode.conditionals;

import com.chaicode.conditionals.model.CoffeeExtras;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("07 - Bean & Brew: Coffee Order (9 pts)")
class CoffeeShopTest {

    @Nested
    @DisplayName("Base prices by size")
    class BasePrices {

        @Test
        void smallRegular() {
            assertEquals(3.00, CoffeeShop.calculateCoffeePrice("small", "regular"));
        }

        @Test
        void mediumRegular() {
            assertEquals(4.00, CoffeeShop.calculateCoffeePrice("medium", "regular"));
        }

        @Test
        void largeRegular() {
            assertEquals(5.00, CoffeeShop.calculateCoffeePrice("large", "regular"));
        }
    }

    @Nested
    @DisplayName("Coffee type add-ons")
    class TypeAddons {

        @Test
        void smallLatte() {
            assertEquals(4.00, CoffeeShop.calculateCoffeePrice("small", "latte"));
        }

        @Test
        void mediumCappuccino() {
            assertEquals(5.50, CoffeeShop.calculateCoffeePrice("medium", "cappuccino"));
        }

        @Test
        void largeMocha() {
            assertEquals(7.00, CoffeeShop.calculateCoffeePrice("large", "mocha"));
        }
    }

    @Nested
    @DisplayName("Extras")
    class Extras {

        @Test
        void whippedCream() {
            assertEquals(3.50, CoffeeShop.calculateCoffeePrice("small", "regular",
                    new CoffeeExtras(true, false)));
        }

        @Test
        void extraShot() {
            assertEquals(5.75, CoffeeShop.calculateCoffeePrice("medium", "latte",
                    new CoffeeExtras(false, true)));
        }

        @Test
        void whippedCreamAndExtraShot() {
            assertEquals(8.25, CoffeeShop.calculateCoffeePrice("large", "mocha",
                    new CoffeeExtras(true, true)));
        }

        @Test
        void noExtrasObject() {
            assertEquals(5.00, CoffeeShop.calculateCoffeePrice("small", "mocha"));
        }
    }

    @Nested
    @DisplayName("Invalid input")
    class InvalidInput {

        @Test
        void invalidSize() {
            assertEquals(-1, CoffeeShop.calculateCoffeePrice("huge", "regular"));
        }

        @Test
        void invalidType() {
            assertEquals(-1, CoffeeShop.calculateCoffeePrice("small", "espresso"));
        }

        @Test
        void bothInvalid() {
            assertEquals(-1, CoffeeShop.calculateCoffeePrice("tiny", "flat white"));
        }
    }
}
