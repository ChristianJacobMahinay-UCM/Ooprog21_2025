import java.util.Scanner;

public class DebugFive2 {
    public static void main(String args[]) {
        int num;
        int num2;
        Scanner input = new Scanner(System.in);

    
        System.out.print("Enter a number: ");
        num = input.nextInt();  // Corrected method call
        System.out.print("Enter another number: ");
        num2 = input.nextInt();  // Corrected method call

    
        if (num % num2 == 0 || num2 % num == 0) {  // Corrected condition
            System.out.println("One of these numbers is");
            System.out.println(" evenly divisible into the other");
        } else {
            System.out.println("Neither of these numbers is");
            System.out.println(" evenly divisible into the other");
        }
    }
}
