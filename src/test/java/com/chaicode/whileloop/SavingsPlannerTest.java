package com.chaicode.whileloop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("While Loop - Savings Planner")
class SavingsPlannerTest {

    @Test
    void monthsNeeded() {
        assertEquals(4, SavingsPlanner.monthsToGoal(100, 200, 900));
    }

    @Test
    void alreadyAtGoal() {
        assertEquals(0, SavingsPlanner.monthsToGoal(1000, 100, 500));
    }

    @Test
    void invalidDeposit() {
        assertEquals(-1, SavingsPlanner.monthsToGoal(0, 0, 1000));
    }
}
