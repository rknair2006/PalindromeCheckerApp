package com.palindromecheckerapp.uc5;

import java.util.Scanner;
import java.util.Stack;

/**
 * Approach Name: Stack-Based Approach
 * Logic Used: Push all characters into a stack, then pop them to build the reverse order.
 * Time Complexity: O(n) because pushing and popping each character happens once.
 */
public class UC5StackPalindromeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("UC5: Stack-Based Palindrome Check");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        for (char current : input.toCharArray()) {
            stack.push(current);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        boolean isPalindrome = input.equals(reversed.toString());
        System.out.println("\"" + input + "\"" + (isPalindrome ? " is a palindrome." : " is not a palindrome."));

        scanner.close();
    }
}
