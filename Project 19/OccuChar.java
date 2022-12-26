// Write a Program in Java to Find Occurrences of Each Character in a String.

public class OccuChar {
    public static void main(String[] args){
        String str = "Write a Program in Java";
        int[] freq = new int[str.length()];
        char[] string = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            freq[i] = 1;
            for(int j = i + 1; j < str.length(); j++){
                if(string[i] == string[j]){
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        System.out.println("Characters and their corresponding frequencies");
        for(int i = 0; i < freq.length; i++){
            if(string[i] != ' ' && string[i] != '0'){
                System.out.println(string[i] + " - " + freq[i]);
            }
        }
    }
}
