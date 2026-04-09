package com.palindromecheckerapp.uc11;

/**
 * Approach Name: OOP Service Class
 * Logic Used: Business logic is moved into a separate class to improve code organization.
 * Time Complexity: O(n) because the service compares characters from both ends.
 */
public class PalindromeService {

    public boolean isPalindrome(String input) {
        for (int index = 0; index < input.length() / 2; index++) {
            if (input.charAt(index) != input.charAt(input.length() - 1 - index)) {
                return false;
            }
        }
        return true;
    }
}
