// Write a Program in Java to Calculate the Simple Interest

import java.util.Scanner;
public class Simple_Interest {
    public static void main(String[] args){
        
        int principle_amount;
        int rate_of_interest;
        int time_period;
        int interest;
        int total;

        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the principle amount: "); // Prompt the user to enter the principle amount
        principle_amount = input.nextInt();
        System.out.print("Enter the number of years/Months: "); // Prompt the user to enter the number of years/months
        time_period = input.nextInt();
        System.out.print("Enter the interest rate: "); // Prompt the user to enter the interest rate
        rate_of_interest = input.nextInt();
        
        interest = (principle_amount * time_period * rate_of_interest/100);// Calculate the simple interest
        total = principle_amount + interest; // Calculate the total amount

        System.out.println("Total interest: "+ interest);  // Print the total interest

        System.out.println("Total Payable Amount:" + (total)); // Print the total payable amount

        System.out.println("Monthly Installment: "+ (total/time_period)); // Display the monthly installment

    }
}