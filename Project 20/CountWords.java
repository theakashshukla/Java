// Java Program to Get String and Count Number of Words in Provided String.

public class CountWords {
    public static void mai(){
        String s1 = "Hello World";
        int count = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
