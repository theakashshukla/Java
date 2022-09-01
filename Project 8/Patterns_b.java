// Write a Program in Java to Display the Following Patterns using Functions.
// 1
// 12
// 123
// 1234
// 12345

import java.util.Scanner;
public class Patterns_b {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}