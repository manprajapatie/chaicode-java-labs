package com.chaicode.methods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Methods - Loan EMI")
class LoanEMITest {

    @Test
    void standardEmi() {
        assertEquals(2051.65, LoanEMI.calculateEmi(100000, 8.5, 60));
    }

    @Test
    void zeroInterest() {
        assertEquals(1666.67, LoanEMI.calculateEmi(100000, 0, 60));
    }

    @Test
    void invalidPrincipal() {
        assertEquals(-1.0, LoanEMI.calculateEmi(-1000, 8.5, 60));
    }
}
