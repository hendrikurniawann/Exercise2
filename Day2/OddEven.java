package org.example.Day2;

import java.util.Scanner;

public class OddEven {

    // Function to check if a number is odd
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is odd or even
        boolean result = isOdd(number);

        // Output the result
        if (result) {
            System.out.println(number + " is odd.");
        } else {
            System.out.println(number + " is even.");
        }

        scanner.close();
    }
}

