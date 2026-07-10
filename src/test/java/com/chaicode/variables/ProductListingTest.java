package com.chaicode.variables;

import com.chaicode.variables.model.ProductItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Variables - Product Listing")
class ProductListingTest {

    @Test
    void organicListing() {
        var item = new ProductItem("Tomatoes", 3, 1.50, true);
        assertEquals("Organic Tomatoes x3 = $4.50", ProductListing.formatListing(item));
    }

    @Test
    void regularListing() {
        var item = new ProductItem("Milk", 2, 3.00, false);
        assertEquals("Regular Milk x2 = $6.00", ProductListing.formatListing(item));
    }

    @Test
    void singleItem() {
        var item = new ProductItem("Bread", 1, 2.75, false);
        assertEquals("Regular Bread x1 = $2.75", ProductListing.formatListing(item));
    }
}
