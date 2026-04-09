package com.palindromecheckerapp.uc12;

/**
 * Strategy interface for palindrome checking.
 */
public interface PalindromeStrategy {

    boolean isPalindrome(String input);

    String getStrategyName();
}
