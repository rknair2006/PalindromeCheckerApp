package com.palindromecheckerapp.uc12;

import java.util.Scanner;

/**
 * Approach Name: Strategy Design Pattern
 * Logic Used: Choose one algorithm object at runtime and call a common interface.
 * Time Complexity: Depends on the selected strategy, but all included strategies run in O(n).
 */
public class UC12StrategyPatternApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("UC12: Strategy Design Pattern Implementation");
        System.out.println("Choose a strategy:");
        System.out.println("1. Loop Strategy");
        System.out.println("2. StringBuilder Strategy");
        System.out.println("3. Recursive Strategy");
        System.out.print("Enter your choice: ");

        int choice = Integer.parseInt(scanner.nextLine());
        PalindromeStrategy strategy = selectStrategy(choice);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = strategy.isPalindrome(input);
        System.out.println("Selected approach: " + strategy.getStrategyName());
        System.out.println("\"" + input + "\"" + (isPalindrome ? " is a palindrome." : " is not a palindrome."));

        scanner.close();
    }

    private static PalindromeStrategy selectStrategy(int choice) {
        if (choice == 2) {
            return new StringBuilderStrategy();
        }

        if (choice == 3) {
            return new RecursiveStrategy();
        }

        return new LoopStrategy();
    }
}
