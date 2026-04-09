package com.palindromecheckerapp.uc9;

import java.util.Scanner;

/**
 * Approach Name: Recursive Method
 * Logic Used: Compare the first and last characters, then call the same method on the smaller substring.
 * Time Complexity: O(n) because one pair of characters is handled per recursive call.
 */
public class UC9RecursivePalindromeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("UC9: Recursive Palindrome Check");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = isPalindrome(input);
        System.out.println("\"" + input + "\"" + (isPalindrome ? " is a palindrome." : " is not a palindrome."));

        scanner.close();
    }

    private static boolean isPalindrome(String value) {
        if (value.length() <= 1) {
            return true;
        }

        if (value.charAt(0) != value.charAt(value.length() - 1)) {
            return false;
        }

        return isPalindrome(value.substring(1, value.length() - 1));
    }
}
