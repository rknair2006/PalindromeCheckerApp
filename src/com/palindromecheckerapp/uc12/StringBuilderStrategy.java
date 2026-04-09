package com.palindromecheckerapp.uc12;

/**
 * Approach Name: Strategy Pattern with StringBuilder Strategy
 * Logic Used: Reverse the string and compare it with the original.
 * Time Complexity: O(n).
 */
public class StringBuilderStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {
        return input.equals(new StringBuilder(input).reverse().toString());
    }

    @Override
    public String getStrategyName() {
        return "StringBuilder Strategy";
    }
}
