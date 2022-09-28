//Chor Sipahi Game Projects
import java.util.*;
public class Rmcs {
    public static void main(String[] args) {
        // Creae Option choose your option
        System.out.println("Choose your option");
        System.out.println("1.Raja");
        System.out.println("2.Mantri");
        System.out.println("3.Chor");
        System.out.println("4.Sipahi");
        // Create Scanner
        Scanner input = new Scanner(System.in); // Create Scanner 
        int option = input.nextInt(); // Read the option

        Random random = new Random(); // Create Random
        int randomOption = random.nextInt(4) + 1; // 1 to 4 random number 
        // Create if else
        if (option == randomOption) {  // If option is equal to randomOption
            System.out.println("You Win"); // Print You Win
        } else {
            System.out.println("You Lose");  // Print You Lose
        }

    }
}
