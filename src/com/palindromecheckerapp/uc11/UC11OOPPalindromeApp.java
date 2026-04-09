package com.palindromecheckerapp.uc11;

import java.util.Scanner;

/**
 * Approach Name: Separate Class (OOP Approach)
 * Logic Used: The main class handles input/output, and the service class handles palindrome logic.
 * Time Complexity: O(n) because the service checks half of the string.
 */
public class UC11OOPPalindromeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeService palindromeService = new PalindromeService();

        System.out.println("UC11: Separate Class (OOP Approach)");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = palindromeService.isPalindrome(input);
        System.out.println("\"" + input + "\"" + (isPalindrome ? " is a palindrome." : " is not a palindrome."));

        scanner.close();
    }
}
