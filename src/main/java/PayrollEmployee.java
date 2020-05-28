public abstract class PayrollEmployee {

    int employeeId;
    String firstName;
    String lastName;
    double payCheckTotal;

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
