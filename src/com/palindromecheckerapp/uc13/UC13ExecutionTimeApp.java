package com.palindromecheckerapp.uc13;

import java.util.Scanner;

/**
 * Approach Name: Execution Time Measurement
 * Logic Used: Measure the time taken by a loop-based palindrome check using System.nanoTime().
 * Time Complexity: O(n) for the palindrome logic, plus constant-time timing calls.
 */
public class UC13ExecutionTimeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("UC13: Execution Time Measurement Version");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        long startTime = System.nanoTime();
        boolean isPalindrome = isPalindrome(input);
        long endTime = System.nanoTime();

        System.out.println("\"" + input + "\"" + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
        System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");

        scanner.close();
    }

    private static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
