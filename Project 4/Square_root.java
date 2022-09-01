// Write a Program in Java to Calculate Square Root of a Number.

import java.util.Scanner;
public class Square_root {
    public static void main(String[] args) {
        System.out.println("Enter the number: "); // Prompt the user to enter the number.
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble(); // Read the number.
        double square_root = Math.sqrt(number); // Calculate the square root of the number.
        System.out.println("The square root of the number is: " + square_root);
    }
}
