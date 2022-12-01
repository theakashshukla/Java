// Write a Program in Java to Make First Alphabet Capital of Each Word in a String.

import java.util.Scanner;

public class StringAC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String newStr = "";
        for(String word: words){
            newStr += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }
        System.out.println("New String: " + newStr);
    }
}