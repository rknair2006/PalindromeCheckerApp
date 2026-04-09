package com.palindrome.app;

public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "level";
        String reverse = "";

        // Reverse using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        // Compare
        if (input.equals(reverse)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}
