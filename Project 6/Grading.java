// Write a Program in Java to Display Grading of Student When His Percentage is Input from Keyboard.

import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        System.out.println("Enter the percentage: "); // Prompt the user to enter the percentage.
        Scanner input = new Scanner(System.in);
        double percentage = input.nextDouble(); // Read the percentage.
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}