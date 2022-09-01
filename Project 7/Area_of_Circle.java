// Write a Program in Java to Calculate Area of Circle Using Scanner Class.

import java.util.Scanner;
public class Area_of_Circle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: "); // Prompt the user to enter the radius of the circle.
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble(); // Read the radius of the circle.
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}