package com.palindromecheckerapp.uc1;

import java.util.Scanner;

/**
 * Approach Name: Welcome Program
 * Logic Used: This introductory program only displays a welcome message.
 * Time Complexity: O(1) because it performs constant-time output operations.
 */
public class UC1WelcomeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to PalindromeCheckerApp");
        System.out.println("This project demonstrates multiple palindrome checking techniques.");
        System.out.print("Press Enter to continue...");
        scanner.nextLine();

        System.out.println("Thank you for exploring the application.");
        scanner.close();
    }
}
