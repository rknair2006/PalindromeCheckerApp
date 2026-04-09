package com.palindromecheckerapp.uc12;

/**
 * Approach Name: Strategy Pattern with Loop Strategy
 * Logic Used: Compare characters from the start and end using a loop.
 * Time Complexity: O(n).
 */
public class LoopStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {
        for (int index = 0; index < input.length() / 2; index++) {
            if (input.charAt(index) != input.charAt(input.length() - 1 - index)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getStrategyName() {
        return "Loop Strategy";
    }
}
