package groupwork.classwork;

public class Supplier extends Employee{
    private int quantity;
    private double price;
    private String hiredDate;

    public Supplier(String firstName, String lastName, int socialSecurity, int quantity, double price, String hiredDate){
        super(firstName, lastName, socialSecurity);
        this.quantity = quantity;
        this.price = price;
        this.hiredDate = hiredDate;
    }
    public Supplier(){
    }

    public String calculatePay() {
        double x = getQuantity() * getPrice();
        return "Employee type: Supplier Employee" + "\n" + "First Name: " + getFirstName() + "\n" + "Last Name: " + getLastName() + "\n" + "Hired Date: " + getHiredDate() + "\n" + "Earned: " + x;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }

    public String cutCheck(){double x = getQuantity() * getPrice(); return "Paid Supplier: " + x;}
}
