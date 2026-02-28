// version 2.0
// author Abc
// useCase 2:

public class PalindroneCheckerApp  {

    public static void main(String[] args) {

        // Original String
        String input = "radar";

        System.out.println("========================================");
        System.out.println("        PALINDROME CHECKER APP          ");
        System.out.println("========================================");

        System.out.println("Input String: " + input);

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Two-pointer technique
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
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