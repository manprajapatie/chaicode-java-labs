package com.chaicode.whileloop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("While Loop - ATM Withdrawal")
class ATMWithdrawalTest {

    @Test
    void fullWithdrawal() {
        assertEquals(5, ATMWithdrawal.dispenseBills(200, 100));
    }

    @Test
    void partialWithdrawal() {
        assertEquals(3, ATMWithdrawal.dispenseBills(80, 100));
    }

    @Test
    void notMultipleOf20() {
        assertEquals(-1, ATMWithdrawal.dispenseBills(200, 50));
    }

    @Test
    void negativeRequest() {
        assertEquals(-1, ATMWithdrawal.dispenseBills(100, -40));
    }
}
