package com.palindromecheckerapp.uc8;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Approach Name: LinkedList Approach
 * Logic Used: Store characters in a LinkedList and compare the first and last nodes repeatedly.
 * Time Complexity: O(n) because each comparison removes two characters from the list.
 */
public class UC8LinkedListPalindromeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("UC8: LinkedList Approach");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        LinkedList<Character> characters = new LinkedList<>();
        for (char current : input.toCharArray()) {
            characters.add(current);
        }

        boolean isPalindrome = true;
        while (characters.size() > 1) {
            if (!characters.removeFirst().equals(characters.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("\"" + input + "\"" + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
        scanner.close();
    }
}
