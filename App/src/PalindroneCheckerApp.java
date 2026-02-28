// version 2.0
// author Abc
// useCase 2:

public class PalindroneCheckerApp  {

    public static void main(String[] args) {

        // Original String
        String original = "level";

        System.out.println("========================================");
        System.out.println("        PALINDROME CHECKER APP          ");
        System.out.println("========================================");

        System.out.println("Original String: " + original);

        // Reverse string using for loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);   // String concatenation
        }

        System.out.println("Reversed String: " + reversed);

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("Result: The given string is a PALINDROME.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}