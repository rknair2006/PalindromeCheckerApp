package com.palindromecheckerapp.uc2;

import java.util.Scanner;

/**
 * Approach Name: Simple Loop Check
 * Logic Used: Compare characters from the start and end using a loop.
 * Time Complexity: O(n) because each character is checked at most once.
 */
public class UC2LoopPalindromeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("UC2: Simple Palindrome Check Using Loop");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = true;

        for (int index = 0; index < input.length() / 2; index++) {
            if (input.charAt(index) != input.charAt(input.length() - 1 - index)) {
                isPalindrome = false;
                break;
            }
        }

        printResult(input, isPalindrome);
        scanner.close();
    }

    private static void printResult(String input, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}
