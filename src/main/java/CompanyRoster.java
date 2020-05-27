import java.util.ArrayList;

public class CompanyRoster {

    ArrayList<PayrollEmployee> companyRoster = new ArrayList<>();
    PayrollEmployee executive1 = new PayrollExecutive(1111, "Steve", "Jobs");
    PayrollEmployee developer1 = new PayrollDeveloper(2111, "Billy", "Gooooat");
    PayrollEmployee developer2 = new PayrollDeveloper(2112, "Corny", "Collins");
    PayrollEmployee developer3 = new PayrollDeveloper(2113, "Sarah", "Grass");
    PayrollEmployee sales1 = new PayrollSales(3111, "Money", "McMoneyBags");
    PayrollEmployee hourly1 = new PayrollHourly(4111, "Juanice", "Cuyahoga");
    PayrollEmployee hourly2 = new PayrollHourly(4112, "James", "Smith");

    public void createEmployee(){
        companyRoster.add(executive1);
        companyRoster.add(developer1);
        companyRoster.add(developer2);
        companyRoster.add(developer3);
        companyRoster.add(sales1);
        companyRoster.add(hourly1);
        companyRoster.add(hourly2);

    }
    public void calculatePay(double bonus, double commission){
        for(PayrollEmployee employee : companyRoster){
            if(employee instanceof ReceiveBonus){
                ((ReceiveBonus) employee).receiveBonus(bonus);
            }
            if(employee instanceof Insurance){
                ((Insurance) employee).payInsurance();
            }
            if (employee instanceof PayrollSales){
                ((PayrollSales) employee).setSaleCommission(commission);
            }
            if (employee instanceof PayrollHourly){
                ((PayrollHourly) employee).calculateGross();
            }
            if(employee instanceof Salary){
                ((Salary) employee).payPeriodEarnings();
            }
        }
    }
}
