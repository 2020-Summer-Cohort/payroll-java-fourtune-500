public class PayrollDeveloper extends PayrollEmployee implements ReceiveBonus, Insurance {

    double payPeriodEarnings = 9000;

    public PayrollDeveloper(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }

    public void receiveBonus(double bonus){
        payCheckTotal += bonus;
    }
    public void payInsurance(){
        payCheckTotal -= 80.00;
    }
    public double getPayPeriodEarnings(){
        return payPeriodEarnings;
    }
    @Override
    public void setPaycheckTotal() {

        payCheckTotal += payPeriodEarnings;
    }
}
