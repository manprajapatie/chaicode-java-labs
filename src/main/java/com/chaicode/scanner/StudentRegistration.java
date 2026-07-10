package com.chaicode.scanner;

import com.chaicode.scanner.model.StudentInfo;

import java.util.Scanner;

/**
 * CampusConnect Registration Desk
 *
 * <p>Read student registration from a Scanner in this order:
 * <ol>
 *   <li>Full name (line)</li>
 *   <li>Age (int)</li>
 *   <li>Course code (line)</li>
 * </ol>
 *
 * <p>Rules:
 * <ul>
 *   <li>Trim whitespace from name and course</li>
 *   <li>If age is not between 16 and 100 inclusive, return null</li>
 *   <li>If name or course is empty after trim, return null</li>
 *   <li>If scanner is null, return null</li>
 * </ul>
 *
 * @param scanner input source
 * @return StudentInfo or null for invalid input
 */
public final class StudentRegistration {

    private StudentRegistration() {}

    public static StudentInfo readRegistration(Scanner scanner) {
        // Your code here
        return null;
    }
}
