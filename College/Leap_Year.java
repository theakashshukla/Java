import java.util.Scanner;
public class Leap_Year {
    
    public static void main(String[] args) {
        System.out.println("Enter the year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year % 4 == 0) {
            System.out.println("Leap year:" + year);
        } else {
            System.out.println("Not a leap year :" + year);
        }
    }
}