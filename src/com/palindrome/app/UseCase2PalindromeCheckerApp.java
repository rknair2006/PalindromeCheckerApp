package com.palindrome.app;

public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {

        // Hardcoded string
        String str = "madam";
        String reverse = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // Check palindrome
        if (str.equals(reverse)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
    }
}