import java.util.Scanner;
public class First {
    public static void main(String[] args){
        
        int principle_amount;
        int rate_of_interest;
        int time_period;
        int total;

        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter the principle amount: ");
        principle_amount = sc.nextInt();
        System.out.println("Enter the number of years/Months: "); 
        time_period = sc.nextInt();
        System.out.println("Enter the intrest rate: ");
        rate_of_interest = sc.nextInt();
        
        total = (principle_amount * time_period * rate_of_interest/100);

        System.out.println("Total Intrest: "+ total);

    }
}