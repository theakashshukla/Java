// Java Program to Get String and Count Number of Words in Provided String.

public class CountWords {
    public static void main(String[] args){
        String str = "Write a Program in Java";
        int count = 1;
        for(int i = 0; i < str.length() - 1; i++){
            if((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')){
                count++;
            }
        }
        System.out.println("Number of words in the string: " + count);
    }
}
