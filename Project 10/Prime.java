
// Write a Program in Java to Determine Whether a Number Input from Keyboard is Prime Number Or Not.
import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;

        if (n <= 1) {
            System.out.println("The number is not prime");
            return;
        }
        for(int i=2; i<n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count > 0){
            System.out.println("The number is not prime");
        }
        else{
            System.out.println("The number is prime");
        }
    }
}