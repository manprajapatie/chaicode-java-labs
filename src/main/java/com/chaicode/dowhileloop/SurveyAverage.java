package com.chaicode.dowhileloop;

/**
 * CafeFeedback Survey
 *
 * <p>A coffee shop tablet collects 1–5 star ratings until the customer enters -1 to finish.
 * Process ratings from an array (simulating repeated input) and return the average.
 *
 * <p>Rules:
 * <ul>
 *   <li>Read ratings from start of array until -1 is encountered (or array ends)</li>
 *   <li>Ignore ratings outside 1–5</li>
 *   <li>If no valid ratings before -1, return -1.0</li>
 *   <li>Average rounded to 1 decimal: Math.round(avg * 10.0) / 10.0</li>
 *   <li>Use a do-while loop: process at least one element if array is non-empty</li>
 * </ul>
 *
 * @param ratings input stream of ratings, terminated by -1
 * @return average rating, or -1.0 if no valid ratings
 */
public final class SurveyAverage {

    private SurveyAverage() {}

    public static double averageUntilSentinel(int[] ratings) {
        // Your code here
        return 0.0;
    }
}
