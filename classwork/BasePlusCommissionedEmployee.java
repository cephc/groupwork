package groupwork.classwork;

public class BasePlusCommissionedEmployee extends Employee {
    private double commissionRate;
    private double grossSales;
    private double baseSalary;
    private String hiredDate;
    //constructor
    public BasePlusCommissionedEmployee(){
    }
    public BasePlusCommissionedEmployee(String firstName, String lastName, int socialSecurity, double commissionRate, double grossSales, double baseSalary, String hiredDate){
        super(firstName, lastName, socialSecurity);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
        this.baseSalary = baseSalary;
        this.hiredDate = hiredDate;
    }
    //methods
    public String calculatePay(){
        double payRate = (getCommissionRate() * getGrossSales()) + getBaseSalary();
        double newPayRate = Math.round(payRate*100.00)/100.00;
        return "Employee type: Base Plus Commission Employee" + "\n" + "First Name: " + getFirstName() + "\n" + "Last Name: " + getLastName() + "\n" + "Hired Date: " + getHiredDate() + "\n" + "Earned: " + newPayRate;

    }
    //getters
    public double getCommissionRate() {
        return this.commissionRate;
    }
    public double getGrossSales() {
        return this.grossSales;
    }
    public double getBaseSalary() {
        return this.baseSalary;
    }

    public String getHiredDate() {
        return this.hiredDate;
    }

    //setters
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }
}
