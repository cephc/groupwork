package groupwork.classwork;

public class CommissionedEmployee extends Employee implements IPayable{
    private double commissionRate;
    private double grossSales;
    private String hiredDate;
    //constructor
    public CommissionedEmployee(){
    }
    public CommissionedEmployee(String firstName, String lastName, int socialSecurity, double commissionRate, double grossSales, String hiredDate){
        super(firstName, lastName, socialSecurity);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
        this.hiredDate = hiredDate;
    }
    //methods

    public String cutCheck(){
        double payRate = commissionRate * grossSales;
        double newPayRate = Math.round(payRate*100.00)/100.00;
        return  "Paid CommissionedEmployee: " + newPayRate;
    }
    public String calculatePay(){
        double payRate = commissionRate * grossSales;
        double newPayRate = Math.round(payRate*100.00)/100.00;
        return "Employee type: Commission Employee" + "\n" + "First Name: " + getFirstName() + "\n" + "Last Name: " + getLastName() + "\n" + "Hired Date: " + getHiredDate() + "\n" + "Earned: " + newPayRate;
    }
    //getter
    public double getCommissionRate() {
        return this.commissionRate;
    }
    public double getGrossSales() {
        return this.grossSales;
    }
    public String getHiredDate() {
        return this.hiredDate;
    }
    //setter
    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
}
