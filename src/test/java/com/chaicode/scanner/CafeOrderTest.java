package com.chaicode.scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Scanner - Cafe Order")
class CafeOrderTest {

    @Test
    void multipleItems() {
        var scanner = new Scanner("4.50\n3.25\n2.00\nDONE\n");
        assertEquals(9.75, CafeOrder.readOrderTotal(scanner));
    }

    @Test
    void skipsBlankLines() {
        var scanner = new Scanner("\n5.00\n\nDONE\n");
        assertEquals(5.0, CafeOrder.readOrderTotal(scanner));
    }

    @Test
    void nullScanner() {
        assertEquals(0.0, CafeOrder.readOrderTotal(null));
    }
}
