// Write a Program in Java to Check Given String is Palindrome String Or Not in Java.

import java.util.Scanner;
public class PalindromeS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not Palindrome String");
        }
    }
}
