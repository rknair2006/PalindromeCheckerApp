package com.palindromecheckerapp.uc3;

import java.util.Scanner;

/**
 * Approach Name: StringBuilder Reverse
 * Logic Used: Reverse the input using StringBuilder and compare it with the original string.
 * Time Complexity: O(n) because reversing and comparison both depend on string length.
 */
public class UC3StringBuilderPalindromeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("UC3: Palindrome Check Using StringBuilder.reverse()");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        boolean isPalindrome = input.equals(reversed);

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
