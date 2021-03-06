package groupwork.classwork;

public class HourlyEmployee extends Employee{
    private String hiredDate;
    private double hourlyWage;
    private double hoursWorked;
    //constructors
    public HourlyEmployee(){
    }
    public HourlyEmployee(String firstName, String lastName, int socialSecurity, double hourlyWage, double hoursWorked, String hiredDate){
        super(firstName, lastName, socialSecurity);
        this.hourlyWage = hourlyWage;
        this.hiredDate = hiredDate;
        this.hoursWorked = hoursWorked;
    }
    //method

    public String cutCheck(){
        double payRate = getHoursWorked() * getHourlyWage();
        double newPayRate = Math.round(payRate*100.00)/100.00;
        if(getHoursWorked() > 40){
            double overtimeHours = getHoursWorked() - 40;
            newPayRate = (40 * getHourlyWage()) + (overtimeHours * getHourlyWage());
        }
        return "Paid HourlyEmployee: " + getHourlyWage() + newPayRate;
    }

    public String calculatePay(){
        double payRate = getHoursWorked() * getHourlyWage();
        double newPayRate = Math.round(payRate*100.00)/100.00;
        if(getHoursWorked() > 40){
            double overtimeHours = getHoursWorked() - 40;
            newPayRate = (40 * getHourlyWage()) + (overtimeHours * getHourlyWage());
        }
        return "Employee type: Hourly Employee" + "\n" + "First Name: " + getFirstName() + "\n" + "Last Name: " + getLastName() + "\n" + "Hired Date: " + getHiredDate() + "\n" + "Earned: " + newPayRate;
    }
    //getters
    public double getHourlyWage(){
        return this.hourlyWage;
    }
    public String getHiredDate() {
        return hiredDate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    //setters
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }



}
