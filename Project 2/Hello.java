public class Hello {
    public static void main(String[] args) {
           
        int a = 5;
        int b = 3;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        int sum = a + b;
        System.out.print("Sum of" + sum);

    }
}