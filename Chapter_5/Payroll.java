import java.util.Scanner;

public class Payroll {

  
    static class Employee {
        private int employeeNumber;
        private double payRate;
        public static final int MAX_EMPLOYEE_NUMBER = 9999;
        public static final double MAX_RATE = 60.00;

        public Employee(int employeeNumber, double payRate) {
            if (employeeNumber > MAX_EMPLOYEE_NUMBER) {
                this.employeeNumber = MAX_EMPLOYEE_NUMBER;
            } else {
                this.employeeNumber = employeeNumber;
            }

            if (payRate > MAX_RATE) {
                this.payRate = MAX_RATE;
            } else {
                this.payRate = payRate;
            }
        }

        public int getEmployeeNumber() {
            return employeeNumber;
        }

        public double getPayRate() {
            return payRate;
        }
    }

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = input.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double rate = input.nextDouble();

    
        Employee emp = new Employee(1234, rate);

        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(hoursWorked - 40, 0);

        double regularPay = regularHours * emp.getPayRate();
        double overtimePay = overtimeHours * emp.getPayRate() * 1.5;

        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);
    }
}
