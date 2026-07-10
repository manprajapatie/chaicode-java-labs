package com.chaicode.strings;

/**
 * BlogHost URL Slug Builder
 *
 * <p>Convert a blog post title into a URL slug using StringBuilder.
 *
 * <p>Rules:
 * <ul>
 *   <li>Trim and lowercase the title</li>
 *   <li>Replace spaces with hyphens</li>
 *   <li>Remove characters that are not a-z, 0-9, or hyphen</li>
 *   <li>Collapse multiple consecutive hyphens into one</li>
 *   <li>Remove leading/trailing hyphens</li>
 *   <li>If title is null or empty after processing, return ""</li>
 * </ul>
 *
 * <p>Example: "Hello World! Java 101" → "hello-world-java-101"
 *
 * @param title blog post title
 * @return URL slug
 */
public final class SlugBuilder {

    private SlugBuilder() {}

    public static String toSlug(String title) {
        // Your code here
        return "";
    }
}
