package classwork;

public class Supplier {
    private String name;
    private int quantity;
    private double price;
    //constructor
    public Supplier(){
    }
    public Supplier(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    //getters
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
