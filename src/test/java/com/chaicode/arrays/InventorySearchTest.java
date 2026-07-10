package com.chaicode.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Arrays - Inventory Search")
class InventorySearchTest {

    @Test
    void foundAtIndex() {
        assertEquals(2, InventorySearch.findSkuIndex(
                new String[]{"SKU-A", "SKU-B", "SKU-C"}, "SKU-C"));
    }

    @Test
    void notFound() {
        assertEquals(-1, InventorySearch.findSkuIndex(
                new String[]{"SKU-A", "SKU-B"}, "SKU-Z"));
    }

    @Test
    void nullSku() {
        assertEquals(-1, InventorySearch.findSkuIndex(new String[]{"SKU-A"}, null));
    }
}
