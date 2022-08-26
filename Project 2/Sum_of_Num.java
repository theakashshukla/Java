// Write a Program in Java to Calculate  Sum  of  Two  Numbers  Input  from Command Line Argument.
import java.util.Scanner;
public class Sum_of_Num {

    public static void main (String[] args) {
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter the first number: "); // Prompt the user to enter the first number  
        num1 = sc.nextInt();
        System.out.print("Enter the second number: "); // Prompt the user to enter the second number
        num2 = sc.nextInt();
        System.out.println("Sum of two numbers: " + (num1 + num2)); // Print the sum of two numbers
    }
}