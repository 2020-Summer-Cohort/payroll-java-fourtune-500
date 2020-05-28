import java.util.ArrayList;
import java.util.Collection;

public class CompanyRoster {

    double bonusAmount;
    boolean chargeInsurance;

    ArrayList<PayrollEmployee> companyRoster = new ArrayList<>();
    PayrollEmployee executive1 = new PayrollExecutive(1111, "Steve", "Jobs");
    PayrollEmployee developer1 = new PayrollDeveloper(2111, "Billy", "Gooooat");
    PayrollEmployee developer2 = new PayrollDeveloper(2112, "Corny", "Collins");
    PayrollEmployee developer3 = new PayrollDeveloper(2113, "Sarah", "Grass");
    PayrollEmployee sales1 = new PayrollSales(3111, "Money", "McMoneyBags");
    PayrollEmployee hourly1 = new PayrollHourly(4111, "Juanice", "Cuyahoga");
    PayrollEmployee hourly2 = new PayrollHourly(4112, "James", "Smith");

    public ArrayList<PayrollEmployee> getEmployeeList(){
        return companyRoster;
    }
    public void createEmployee(){
        companyRoster.add(executive1);
        companyRoster.add(developer1);
        companyRoster.add(developer2);
        companyRoster.add(developer3);
        companyRoster.add(sales1);
        companyRoster.add(hourly1);
        companyRoster.add(hourly2);

    }
    public void setBonusAmount(double bonus){
        bonusAmount = bonus;
    }
    public void setChargeInsurance(boolean input){
        chargeInsurance = input;
    }
    public void calculatePay(){
        for(PayrollEmployee employee : companyRoster){
            employee.setPaycheckTotal();
            if(employee instanceof ReceiveBonus){
                ((ReceiveBonus) employee).receiveBonus(bonusAmount);
            }
            if (chargeInsurance == true) {
                if (employee instanceof Insurance) {
                    ((Insurance) employee).payInsurance();
                }
            }
        }
    }
}
