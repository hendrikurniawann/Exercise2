package org.example.Day2;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert the temperature to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Output the temperature in Celsius
        System.out.println("Temperature in Celsius: " + celsius);

        scanner.close();
    }
}

