// Write a Program in Java to Display the Prime Numbers from 1 to 500 Using Function.
public class RangePrime {
    public static void main(String[] args) {
        int num = 500;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPrime(int n) {
        
           if (n < 2){
               return false;
           }
           else{
        for (int i = 2; i < n/ 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
    }
        return true;
    }
}
