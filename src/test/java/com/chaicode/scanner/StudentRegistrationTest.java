package com.chaicode.scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("Scanner - Student Registration")
class StudentRegistrationTest {

    @Test
    void validRegistration() {
        var scanner = new Scanner("  Priya Sharma \n20\n CS101 \n");
        var info = StudentRegistration.readRegistration(scanner);
        assertNotNull(info);
        assertEquals("Priya Sharma", info.name());
        assertEquals(20, info.age());
        assertEquals("CS101", info.course());
    }

    @Test
    void invalidAge() {
        var scanner = new Scanner("Alex\n15\nMATH\n");
        assertNull(StudentRegistration.readRegistration(scanner));
    }

    @Test
    void emptyName() {
        var scanner = new Scanner("   \n20\nCS101\n");
        assertNull(StudentRegistration.readRegistration(scanner));
    }
}
