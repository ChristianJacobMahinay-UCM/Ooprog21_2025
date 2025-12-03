import java.util.Scanner;

public class ForexExchangeSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};
        double[][] rates = new double[5][5];

        System.out.println("Enter Exchange Rates (PHP) for Nov 1 to Nov 5\n");

      
        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Currency: " + currencies[i]);
            for (int d = 0; d < 5; d++) {
                System.out.print("Rate on Nov " + (d + 1) + ": ");
                rates[i][d] = sc.nextDouble();
            }
            System.out.println();
        }

      
        System.out.println("\n==================== FOREX SUMMARY (Nov 1 – Nov 5) =====================");
        System.out.printf("%-8s | %-6s %-6s %-6s %-6s %-6s %-6s %-6s\n",
                "Currency", "Nov1", "Nov2", "Nov3", "Nov4", "Nov5", "Peak", "Lowest");
        System.out.println("------------------------------------------------------------------------");

        for (int i = 0; i < currencies.length; i++) {
            double peak = rates[i][0];
            double low = rates[i][0];

            for (int d = 1; d < 5; d++) {
                if (rates[i][d] > peak) peak = rates[i][d];
                if (rates[i][d] < low) low = rates[i][d];
            }

            System.out.printf("%-8s | ", currencies[i]);
            for (int d = 0; d < 5; d++) {
                System.out.printf("%-6.2f", rates[i][d]);
            }
            System.out.printf("%-6.2f%-6.2f", peak, low);
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------\n");

        System.out.println("=== DAILY CHANGES (Comparison From Previous Day) ===");
        System.out.println("(+ increase / – decrease / no change for same value)\n");

        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Currency: " + currencies[i]);

            for (int d = 1; d < 5; d++) {
                double today = rates[i][d];
                double yday = rates[i][d - 1];

                System.out.print("Nov " + (d) + " -> Nov " + (d + 1) + ": ");

                if (today > yday) {
                    System.out.printf("+ %.2f\n", today - yday);
                } else if (today < yday) {
                    System.out.printf("- %.2f\n", yday - today);
                } else {
                    System.out.println("No Change");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
