public class DemoGrossPay {

    static final double HOURLY_RATE = 22.75;
   
    public static void calculateGross(double hoursWorked) {
        double grossPay = hoursWorked * HOURLY_RATE;
        System.out.printf("%.1f hours at $%.2f per hour is $%.3f%n", hoursWorked, HOURLY_RATE, grossPay);
    }

    public static void main(String[] args) {
        
        calculateGross(10.0);
        calculateGross(25.0);
        calculateGross(37.5);
    }
}
