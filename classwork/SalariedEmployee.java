package groupwork.classwork;

public class SalariedEmployee extends Employee{
    private double weeklySalary;
    private String hiredDate;
    //constructor
    public SalariedEmployee(){
    }
    public SalariedEmployee(String firstName, String lastName, int socialSecurity, String hiredDate, double weeklySalary){
        super(firstName, lastName, socialSecurity);
        this.hiredDate = hiredDate;
        this.weeklySalary = weeklySalary;
    }
    //method
    public String calculatePay(){
        double payRate = weeklySalary * 4;
        double newPayRate = Math.round(payRate*100.00)/100.00;
        return "Employee type: Salary Employee" + "\n" + "First Name: " + getFirstName() + "\n" + "Last Name: " + getLastName() + "\n" + "Hired Date: " + getHiredDate() + "\n" + "Earned: " + newPayRate;
    }
    //getter
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public String getHiredDate() {
        return hiredDate;
    }
    //setter
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }
}
