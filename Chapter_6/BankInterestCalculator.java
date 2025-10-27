import java.util.Scanner;

public class BankInterestCalculator {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter initial bank balance > ");
        double initialBalance = scanner.nextDouble();

        
        double[] interestRates = {0.02, 0.03, 0.04, 0.05};

        
        for (double rate : interestRates) {
            
            System.out.println("With an initial balance of $" + initialBalance + " at an interest rate of " + rate);
            
            
            double balance = initialBalance;  
            for (int year = 1; year <= 4; year++) {
                balance += balance * rate;  
                System.out.printf("After year %d balance is %.4f\n", year, balance);  
                
            }
            System.out.println(); 
        }

        
        scanner.close();
    }
}
