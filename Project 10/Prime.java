// Write a Program in Java to Determine Whether a Number Input from Keyboard is Prime Number Or Not.
import java.util.Scanner;

public class Prime {
    
    public static void main(String args[]){
        int a;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        for(int i = 2; i <= a/2; i++){
            if(a % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(a + " is a prime number.");
        }else{
            System.out.println(a + " is not a prime number.");
        }

    }
}
