// Write a Program in Java to Reverse Words of a String. | [Code](https://github.com/theakashshukla/Java/tree/main/Project%2018) |

import java.util.Scanner;
public class ReverseS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String newStr = "";
        for(String word: words){
            newStr = word + " " + newStr;
        }
        System.out.println("New String: " + newStr);
    }
}
