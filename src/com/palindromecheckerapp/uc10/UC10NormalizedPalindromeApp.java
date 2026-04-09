package com.palindromecheckerapp.uc10;

import java.util.Scanner;

/**
 * Approach Name: Case-Insensitive and Space-Handling Version
 * Logic Used: Convert input to lowercase and remove spaces before checking with a loop.
 * Time Complexity: O(n) because normalization and comparison depend on input length.
 */
public class UC10NormalizedPalindromeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("UC10: Case-Insensitive and Space-Handling Palindrome Check");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String normalized = input.toLowerCase().replace(" ", "");
        boolean isPalindrome = true;

        for (int index = 0; index < normalized.length() / 2; index++) {
            if (normalized.charAt(index) != normalized.charAt(normalized.length() - 1 - index)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Normalized value: \"" + normalized + "\"");
        System.out.println("\"" + input + "\"" + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
        scanner.close();
    }
}
