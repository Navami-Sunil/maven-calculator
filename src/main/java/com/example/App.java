package com.example;

import java.util.Scanner;

public class App {

    public static double add(double a, double b) {
        return a + b+0;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Menu
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("----1. Addition----");
            System.out.println("----2. Subtraction----");
            System.out.println("----3. Multiplication----");
            System.out.println("----4. Division----");
            System.out.println("----5. Exit----");
            System.out.print("ENTER YOUR CHOICE (1-5): ");

            int choice = sc.nextInt();
            double num1, num2, result;

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    try {
                        result = divide(num1, num2);
                        System.out.println("Result: " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Exiting the calculator. Goodbye!");
                    sc.close();
                    return; // exits main method

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }
}
