package com.chaicode.methods;

/**
 * WelcomeBot Greeting Generator
 *
 * <p>A chatbot greets users based on the hour of day (24-hour format).
 *
 * <p>Rules:
 * <ul>
 *   <li>5–11 → "Good morning, {name}!"</li>
 *   <li>12–16 → "Good afternoon, {name}!"</li>
 *   <li>17–21 → "Good evening, {name}!"</li>
 *   <li>Otherwise → "Good night, {name}!"</li>
 *   <li>If name is null or blank after trim, return "Hello, guest!"</li>
 *   <li>If hour is not 0–23, return "Invalid hour"</li>
 * </ul>
 *
 * @param name user's name
 * @param hour hour of day (0–23)
 * @return greeting message
 */
public final class GreetingGenerator {

    private GreetingGenerator() {}

    public static String greet(String name, int hour) {
        // Your code here
        return "";
    }
}
