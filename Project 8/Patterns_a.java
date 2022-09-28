// Write a Program in Java to Display the Following Patterns using Functions.
// 1
// 22
// 333
// 4444
// 55555

import java.util.Scanner;
public class Patterns_a {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
