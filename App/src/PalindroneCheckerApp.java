// version 2.0
// author Abc
// useCase 2:

public class PalindroneCheckerApp  {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        System.out.println("========================================");
        System.out.println("        PALINDROME CHECKER APP          ");
        System.out.println("========================================");

        System.out.println("Hardcoded Word: " + word);

        // Reverse the string
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println("Result: The given word is a PALINDROME.");
        } else {
            System.out.println("Result: The given word is NOT a palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}