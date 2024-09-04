package org.example.Day2;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the length in centimeters
        System.out.print("Enter length in centimeters: ");
        double centimeters = scanner.nextDouble();

        // Convert centimeters to kilometers
        double kilometers = centimeters / 100000.0;

        // Output the length in kilometers
        System.out.println("Length in kilometers: " + kilometers);

        scanner.close();
    }
}
