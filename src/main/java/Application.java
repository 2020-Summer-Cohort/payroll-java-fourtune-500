import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CompanyRoster roster = new CompanyRoster();
        roster.createEmployee();
        printEmployees(roster);
        obtainUserInput(roster, scanner);
        roster.calculatePay();
        printEmployeesPaycheck(roster);
    }

    public static void printEmployees(CompanyRoster roster) {
        for (PayrollEmployee employee : roster.getEmployeeList()) {
            System.out.println(employee.getEmployeeId() + " " + employee.getFirstName() + " " + employee.getLastName());
        }
    }

    public static void printEmployeesPaycheck(CompanyRoster roster) {
        for (PayrollEmployee employee : roster.getEmployeeList()) {
            System.out.println(employee.getEmployeeId() + " " + employee.getFirstName() + " " + employee.getLastName() + " " + employee.getPayCheckTotal());
        }
    }

    public static void obtainUserInput(CompanyRoster roster, Scanner scanner) {
        int userInput;
        double userDoubleInput;
        boolean hazardInput;
        boolean insuranceInput;

        System.out.println("What is the sales commission?");
        userDoubleInput = scanner.nextDouble();
        System.out.println("Did they make hazard pay? Please answer true or false");
        hazardInput = scanner.nextBoolean();
        System.out.println("Are we charging for Insurance this cycle? Please answer true of false");
        insuranceInput = scanner.nextBoolean();
        roster.setChargeInsurance(insuranceInput);
        for(PayrollEmployee employee : roster.getEmployeeList()){
            if (employee instanceof PayrollHourly) {
                System.out.println("How many hours did " + employee.getFirstName() + " work?");
                userInput = scanner.nextInt();
                scanner.nextLine();
                ((PayrollHourly) employee).setHoursWorked(userInput);
                ((PayrollHourly) employee).setHazardPay(hazardInput);
            }
            if(employee instanceof PayrollSales){
                ((PayrollSales) employee).setSaleCommission(userDoubleInput);
            }
        }
        System.out.println("What was this years bonus?");
        userDoubleInput = scanner.nextDouble();
        roster.setBonusAmount(userDoubleInput);
    }
}
