// Use Case: UC-6
// Queue + Stack Based Palindrome Check

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        System.out.println("========================================");
        System.out.println("        PALINDROME CHECKER APP          ");
        System.out.println("========================================");
        System.out.println("Input String: " + input);

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);      // Enqueue
            stack.push(ch);     // Push
        }

        boolean isPalindrome = true;

        // Compare Dequeue vs Pop
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
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