// Write a Program in Java to Get the Last Index of Any Given Character in a String.

import java.util.Scanner;
public class LastIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);
        int index = str.lastIndexOf(ch);
        System.out.println("Last Index of " + ch + " is " + index);
    }
}
