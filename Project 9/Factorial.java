// Write a Program in Java to Calculate the Factorial of a Number.

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number: "); // Prompt the user to enter the number.
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); // Read the number.
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of the number is: " + factorial);
    }
}