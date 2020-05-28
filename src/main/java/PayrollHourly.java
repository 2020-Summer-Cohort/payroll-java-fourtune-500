public class PayrollHourly extends PayrollEmployee {

    public PayrollHourly(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }

    int hoursWorked;
    double hourlyRate = 20.00;


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
        payCheckTotal = hourlyRate * hoursWorked;
    }
}
