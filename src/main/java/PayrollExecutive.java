public class PayrollExecutive extends PayrollEmployee implements Insurance, ReceiveBonus, Salary {

    double payPeriodEarnings = 20000.00;

    public PayrollExecutive(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }

    @Override
    public void payInsurance() {
        payCheckTotal -= 10;
    }

    @Override
    public void receiveBonus(double bonus) {
        payCheckTotal += bonus*3;
    }
    @Override
    public double payPeriodEarnings() {
        return payPeriodEarnings;
    }
}
