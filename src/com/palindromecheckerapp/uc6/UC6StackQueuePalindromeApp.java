package com.palindromecheckerapp.uc6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Approach Name: Stack and Queue Comparison
 * Logic Used: A stack returns characters in reverse order and a queue returns them in original order.
 * Comparing removals from both structures identifies whether the string is a palindrome.
 * Time Complexity: O(n) because each character is inserted and removed once.
 */
public class UC6StackQueuePalindromeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("UC6: Stack + Queue Comparison");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char current : input.toCharArray()) {
            stack.push(current);
            queue.offer(current);
        }

        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("\"" + input + "\"" + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
        scanner.close();
    }
}
