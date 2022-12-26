// Write a Program in Java to Display Odd Number from 1 to 100.

public class Odd_Number {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
        }
    }
}