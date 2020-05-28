public abstract class PayrollEmployee {

    private int employeeId;
    private String firstName;
    private String lastName;
    protected double payCheckTotal;

    public PayrollEmployee(int employeeId, String firstName, String lastName){
       this.employeeId = employeeId;
       this.firstName = firstName;
       this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPayCheckTotal() {
        return payCheckTotal;
    }

    public abstract void setPaycheckTotal();

}
