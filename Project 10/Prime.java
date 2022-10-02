
// Write a Program in Java to Determine Whether a Number Input from Keyboard is Prime Number Or Not.
import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int m;
        m = n / 2;
        if (m == 0 || m == 1) {
            System.out.println(n + " is not prime number");
        } else {
            System.out.println(m + " is prime number");
        }
    }
}