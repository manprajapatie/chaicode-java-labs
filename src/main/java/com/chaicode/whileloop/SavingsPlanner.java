package com.chaicode.whileloop;

/**
 * DreamSaver Goal Planner
 *
 * <p>A savings app tells users how many months until they reach a goal if they deposit
 * the same amount every month (starting from current savings).
 *
 * <p>Rules:
 * <ul>
 *   <li>Each month add monthlyDeposit to savings until savings >= goal</li>
 *   <li>If monthlyDeposit is 0 or negative, or goal is negative, or currentSavings is negative, return -1</li>
 *   <li>If already at or above goal, return 0</li>
 * </ul>
 *
 * @param currentSavings starting savings
 * @param monthlyDeposit amount saved each month
 * @param goal target amount
 * @return months needed, or -1 for invalid input
 */
public final class SavingsPlanner {

    private SavingsPlanner() {}

    public static int monthsToGoal(int currentSavings, int monthlyDeposit, int goal) {
        // Your code here
        return 0;
    }
}
