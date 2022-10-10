// Write a Program in Java to Display the Prime Numbers from 1 to 500 Using Function.
public class RangePrime {
    public static void main(String[] args) {
        int num = 500;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n) {
        
           if (n < 2){
               return false;
           }
        for (int i = 2; i < n/ 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//    public static void main (String[]args)
//    {

//      int lower = 1, upper = 20;


//      for (int i = lower; i <= upper; i++)
//        if (isPrime (i))
//         System.out.println (i);
//    }

//    static boolean isPrime (int n)
//    {
    //  int count = 0;

     // 0, 1 negative numbers are not prime
    // if (n < 2)
    //    return false;

     // checking the number of divisors b/w 1 and the number n
    //  for (int i = 2; i < n / 2; i++)
    //    {
    //   if (n % i == 0)
    //     return false;
    //    }

     // if reached here then must be true
//      return true;
//    }
//  }