package classwork;

public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double hourlyWage;
    //constructors
    public HourlyEmployee(){
    }
    public HourlyEmployee(String firstName, String lastName, int socialSecurity, double hourlyWage){
        super(firstName, lastName, socialSecurity);
        this.hourlyWage = hourlyWage;
    }
    double hours = Math.random() * 41;
    double payRate = hours * getHourlyWage();
    //method
    public String calculatePay(){
        return "Employee type: Hourly Employee" + "First Name: " + getFirstName() + "Last Name: " + getLastName() + "Earned: " + payRate;
    }
    //getters
    public double getHourlyWage(){
        return this.hourlyWage;
    }
    //setters
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
}
