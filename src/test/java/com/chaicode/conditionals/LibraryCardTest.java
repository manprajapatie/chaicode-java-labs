package com.chaicode.conditionals;

import com.chaicode.conditionals.model.BorrowResult;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("05 - Maple Town Library: Book Borrowing (8 pts)")
class LibraryCardTest {

    @Nested
    @DisplayName("All conditions met")
    class AllConditionsMet {

        @Test
        void age10ValidCardNoOverdue() {
            BorrowResult result = LibraryCard.canBorrowBook(10, true, 0);
            assertTrue(result.allowed());
            assertEquals("You may borrow up to 3 books", result.message());
        }

        @Test
        void age6Minimum() {
            BorrowResult result = LibraryCard.canBorrowBook(6, true, 0);
            assertTrue(result.allowed());
            assertEquals("You may borrow up to 3 books", result.message());
        }

        @Test
        void age65() {
            BorrowResult result = LibraryCard.canBorrowBook(65, true, 0);
            assertTrue(result.allowed());
            assertEquals("You may borrow up to 3 books", result.message());
        }
    }

    @Nested
    @DisplayName("Too young")
    class TooYoung {

        @Test
        void age5() {
            BorrowResult result = LibraryCard.canBorrowBook(5, true, 0);
            assertFalse(result.allowed());
            assertEquals("Too young - must be at least 6 years old", result.message());
        }

        @Test
        void age3CheckedFirst() {
            BorrowResult result = LibraryCard.canBorrowBook(3, false, 2);
            assertFalse(result.allowed());
            assertEquals("Too young - must be at least 6 years old", result.message());
        }
    }

    @Nested
    @DisplayName("Invalid library card")
    class InvalidCard {

        @Test
        void age12InvalidCard() {
            BorrowResult result = LibraryCard.canBorrowBook(12, false, 0);
            assertFalse(result.allowed());
            assertEquals("Invalid library card - please renew at the front desk", result.message());
        }

        @Test
        void invalidCardCheckedBeforeOverdue() {
            BorrowResult result = LibraryCard.canBorrowBook(20, false, 3);
            assertFalse(result.allowed());
            assertEquals("Invalid library card - please renew at the front desk", result.message());
        }
    }

    @Nested
    @DisplayName("Overdue books")
    class OverdueBooks {

        @Test
        void twoOverdueBooks() {
            BorrowResult result = LibraryCard.canBorrowBook(15, true, 2);
            assertFalse(result.allowed());
            assertEquals("Please return your 2 overdue book(s) first", result.message());
        }

        @Test
        void oneOverdueBook() {
            BorrowResult result = LibraryCard.canBorrowBook(30, true, 1);
            assertFalse(result.allowed());
            assertEquals("Please return your 1 overdue book(s) first", result.message());
        }

        @Test
        void fiveOverdueBooks() {
            BorrowResult result = LibraryCard.canBorrowBook(40, true, 5);
            assertFalse(result.allowed());
            assertEquals("Please return your 5 overdue book(s) first", result.message());
        }
    }
}
