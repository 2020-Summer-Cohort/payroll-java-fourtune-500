public class PayrollHourly extends PayrollEmployee {

    public PayrollHourly(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }

    int hoursWorked;
    double hourlyRate = 20.00;
    boolean hazard;


    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHoursWorked(int hours){
        hoursWorked = hours;
    }

    @Override
    public void setPaycheckTotal(){
        if(hazard == true){
            payCheckTotal = (hourlyRate * hoursWorked)*2;
        }else {
            payCheckTotal = hourlyRate * hoursWorked;
        }
    }
    public void setHazardPay(boolean hazardPay){
        hazard = hazardPay;
    }
}
