// Write a Program in Java to Display Name, Age, Calendar and Salary of a Person Input from the Keyboard.

import java.util.Scanner;
public class Display_Info {
    public static void main(String[] args) {
        System.out.println("Enter your name: "); // Prompt the user to enter the name.
        Scanner input = new Scanner(System.in);
        String name = input.nextLine(); // Read the name.
        System.out.println("Enter your age: "); // Prompt the user to enter the age.
        Scanner input1 = new Scanner(System.in);
        int age = input1.nextInt(); // Read the age.
        System.out.println("Enter your calendar: "); // Prompt the user to enter the calendar.
        Scanner input2 = new Scanner(System.in);
        String calendar = input2.nextLine(); // Read the calendar.
        System.out.println("Enter your salary: "); // Prompt the user to enter the salary.
        Scanner input3 = new Scanner(System.in);
        double salary = input3.nextDouble(); // Read the salary.
        System.out.println("Name: " + name); // Display the name.
        System.out.println("Age: " + age); // Display the age.
        System.out.println("Calendar: " + calendar); // Display the calendar.
        System.out.println("Salary: " + salary); // Display the salary.
    }
}