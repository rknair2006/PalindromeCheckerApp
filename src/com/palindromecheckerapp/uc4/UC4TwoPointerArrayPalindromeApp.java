package com.palindromecheckerapp.uc4;

import java.util.Scanner;

/**
 * Approach Name: Two-Pointer Array Technique
 * Logic Used: Convert the string to a character array and compare values using left and right pointers.
 * Time Complexity: O(n) because each character is visited at most once.
 */
public class UC4TwoPointerArrayPalindromeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("UC4: Two-Pointer Technique Using Array");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("\"" + input + "\"" + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
        scanner.close();
    }
}
