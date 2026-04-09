package com.palindromecheckerapp.uc7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Approach Name: Deque with ArrayDeque
 * Logic Used: Insert characters into a deque, then compare characters from both ends.
 * Time Complexity: O(n) because each character is added once and compared at most once.
 */
public class UC7DequePalindromeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("UC7: Deque (ArrayDeque) Approach");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Deque<Character> deque = new ArrayDeque<>();
        for (char current : input.toCharArray()) {
            deque.addLast(current);
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("\"" + input + "\"" + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
        scanner.close();
    }
}
