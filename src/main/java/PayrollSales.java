public class PayrollSales extends PayrollEmployee implements ReceiveBonus {

    double salesCommission;
    double payPeriodEarnings = 3000;

    public PayrollSales(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
        this.payPeriodEarnings = 3000;
    }

    public void setSaleCommission(double sales){
        salesCommission = sales;
    }

    @Override
    public void receiveBonus(double bonus){
        payCheckTotal += bonus;
    }
    @Override
    public void setPaycheckTotal() {
        payCheckTotal +=  payPeriodEarnings + salesCommission;
    }

}
