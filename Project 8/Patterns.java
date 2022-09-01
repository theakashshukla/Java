// Write a Program in Java to Display the Following Patterns using Functions.

import java.util.Scanner;
public class Patterns {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: "); // Prompt the user to enter the number of rows.
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt(); // Read the number of rows.
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}