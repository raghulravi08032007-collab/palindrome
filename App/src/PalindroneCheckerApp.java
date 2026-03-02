// Use Case: UC-7
// Deque-Based Optimized Palindrome Checker

import java.util.Deque;
import java.util.LinkedList;

public class PalindroneCheckerApp{

    public static void main(String[] args) {

        String input = "level";

        System.out.println("========================================");
        System.out.println("        PALINDROME CHECKER APP          ");
        System.out.println("========================================");
        System.out.println("Input: " + input);

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Program execution completed.");
    }
}

/*
 ==========================================================
 INTERFACE - PalindromeStrategy
 ==========================================================
*/

interface PalindromeStrategy {

    boolean check(String input);
}

/*
 ==========================================================
 CLASS - StackStrategy
 ==========================================================
*/

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters to stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}