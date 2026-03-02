// Use Case: UC-7
// Deque-Based Optimized Palindrome Checker

import java.util.Deque;
import java.util.LinkedList;

public class PalindroneCheckerApp  {

    /**
     * Application entry point for UC9.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "madam";

        System.out.println("========================================");
        System.out.println("        PALINDROME CHECKER APP          ");
        System.out.println("========================================");
        System.out.println("Input String: " + input);

        boolean result = check(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Result: The given string is a PALINDROME.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        System.out.println("Program execution completed.");
    }

    /**
     * Recursively checks whether a string is palindrome.
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base condition: If start crosses end
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call
        return check(s, start + 1, end - 1);
    }
}