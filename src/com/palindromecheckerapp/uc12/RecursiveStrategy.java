package com.palindromecheckerapp.uc12;

/**
 * Approach Name: Strategy Pattern with Recursive Strategy
 * Logic Used: Use recursion to compare outer characters and shrink the problem size.
 * Time Complexity: O(n).
 */
public class RecursiveStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {
        return checkRecursively(input);
    }

    private boolean checkRecursively(String input) {
        if (input.length() <= 1) {
            return true;
        }

        if (input.charAt(0) != input.charAt(input.length() - 1)) {
            return false;
        }

        return checkRecursively(input.substring(1, input.length() - 1));
    }

    @Override
    public String getStrategyName() {
        return "Recursive Strategy";
    }
}
