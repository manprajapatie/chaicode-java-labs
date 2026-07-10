package com.chaicode.operators;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Operators - Game Score Comparer")
class GameScoreComparerTest {

    @Test
    void player1Wins() {
        assertEquals("Player 1 wins", GameScoreComparer.compareScores(100, 10, 90, 5));
    }

    @Test
    void player2Wins() {
        assertEquals("Player 2 wins", GameScoreComparer.compareScores(50, 0, 60, 0));
    }

    @Test
    void tie() {
        assertEquals("Tie", GameScoreComparer.compareScores(100, 20, 80, 50));
    }

    @Test
    void invalidInput() {
        assertEquals("Invalid", GameScoreComparer.compareScores(-1, 10, 50, 10));
    }
}
