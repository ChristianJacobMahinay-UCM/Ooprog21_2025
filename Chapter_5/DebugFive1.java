import java.util.*;

public class DebugFive1 {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);

        // Constants for prices
        final double HIGH_PRICE = 2.59;
        final double MED_PRICE = 1.99;
        final double LOW_PRICE = 0.89;

        // Declare variables
        int usersChoice;
        double bill = 0;  // Initialize bill

        // Ask for the user's order
        System.out.println("Order please 1 - Burger 2 - Hotdog");
        System.out.print("3 - Grilled cheese 4 - Fish sandwich >> ");
        usersChoice = kb.nextInt();

        // Add price based on user's choice
        if (usersChoice == 1 || usersChoice == 2) {
            bill = bill + HIGH_PRICE;  // Burger or Hotdog
        } else if (usersChoice == 3 || usersChoice == 4) {
            bill = bill + MED_PRICE;  // Grilled cheese or Fish sandwich
        }

        // Ask if the user wants fries
        System.out.print("Fries with that? 1 - Yes 2 - No >> ");
        usersChoice = kb.nextInt();

        // Add fries price if yes
        if (usersChoice == 1) {
            bill = bill + LOW_PRICE;
        }

        // Display the total bill
        System.out.println("Total bill is " + bill);
    }
}
