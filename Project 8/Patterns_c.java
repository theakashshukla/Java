// Write a Program in Java to Display the Following Patterns using Functions.
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15 

import java.util.Scanner;
public class Patterns_c {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int k = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
