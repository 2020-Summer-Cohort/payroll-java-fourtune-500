public class PayrollHourly extends PayrollEmployee {

    public PayrollHourly(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }

    int hoursWorked;
    double hourlyRate = 20.00;

    public void setHoursWorked(int hours){
        hoursWorked = hours;
    }
    public void calculateGross(){
        setPaycheckTotal(hourlyRate * hoursWorked);
    }
}
