// Write a Program in Java to Reverse Each Word of Given String.

import java.util.Scanner;
public class ReverseEachWS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String newStr = "";
        for(String word: words){
            String rev = "";
            for(int i = word.length() - 1; i >= 0; i--){
                rev += word.charAt(i);
            }
            newStr += rev + " ";
        }
        System.out.println("New String: " + newStr);
    }
}
