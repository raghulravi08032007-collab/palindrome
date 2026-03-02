// Use Case: UC-7
// Deque-Based Optimized Palindrome Checker

import java.util.Deque;
import java.util.LinkedList;

public class PalindroneCheckerApp{

    /**
     * Application entry point for UC11.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "madam";

        System.out.println("========================================");
        System.out.println("        PALINDROME CHECKER APP          ");
        System.out.println("========================================");
        System.out.println("Input String: " + input);

        // Create service object
        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The given string is a PALINDROME.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}