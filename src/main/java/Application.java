public class Application {

    public static void main(String[] args) {
        CompanyRoster roster = new CompanyRoster();
        roster.createEmployee();

        for (PayrollEmployee employee : roster){
            System.out.println(employee);
    }
}
