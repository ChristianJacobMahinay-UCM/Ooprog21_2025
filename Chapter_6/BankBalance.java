import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double balance;
        double interestRate = 0.03; // default 3% interest
        int year = 0;
        int choice;
        
        System.out.print("Enter initial bank balance: ");
        balance = input.nextDouble();
        
        do {
            System.out.print("Do you want to see next year's balance?\nEnter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
            
            if (choice == 1) {
                year++;
                balance += balance * interestRate;
                System.out.printf("After year %d at %.2f%% interest rate, balance is $%.2f\n", year, interestRate * 100, balance);
            }
        } while (choice == 1);
        
        System.out.println("Operation complete.");
        input.close();
    }
}
