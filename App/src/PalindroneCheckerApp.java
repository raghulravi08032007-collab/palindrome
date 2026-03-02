// Use Case: UC-7
// Deque-Based Optimized Palindrome Checker

import java.util.Deque;
import java.util.LinkedList;

public class PalindroneCheckerApp   {

    /**
     * Application entry point for UC10.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        System.out.println("========================================");
        System.out.println("        PALINDROME CHECKER APP          ");
        System.out.println("========================================");
        System.out.println("Original Input: " + input);

        // Normalize the string
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println("Normalized Input: " + normalized);

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The given string is a PALINDROME.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}