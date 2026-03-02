// Use Case: UC-7
// Deque-Based Optimized Palindrome Checker

import java.util.Deque;
import java.util.LinkedList;

public class PalindroneCheckerApp{

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        System.out.println("========================================");
        System.out.println("      PALINDROME PERFORMANCE TEST       ");
        System.out.println("========================================");

        // Normalize input
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 1️⃣ Two Pointer Approach
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(normalized);
        long end1 = System.nanoTime();

        // 2️⃣ Stack Approach
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(normalized);
        long end2 = System.nanoTime();

        System.out.println("Input: " + input);
        System.out.println("Normalized: " + normalized);
        System.out.println();

        System.out.println("Two Pointer Result : " + result1);
        System.out.println("Execution Time (ns): " + (end1 - start1));

        System.out.println();

        System.out.println("Stack Result       : " + result2);
        System.out.println("Execution Time (ns): " + (end2 - start2));

        System.out.println();
        System.out.println("Program execution completed.");
    }

    // Two Pointer Algorithm
    private static boolean twoPointerCheck(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Stack Based Algorithm
    private static boolean stackCheck(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}