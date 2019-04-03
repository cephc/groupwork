package groupwork.classwork;

public abstract class Employee implements IPayable{

    private String firstName;
    private String lastName;
    private int socialSecurity;
    //constructors
    public Employee(){
    }
    public Employee(String firstName, String lastName, int socialSecurity){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
    }
    //method
    public abstract String calculatePay();
    //getters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getSocialSecurity(){
        return this.socialSecurity;
    }
    //setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSocialSecurity(int socialSecurity){
        this.socialSecurity = socialSecurity;
    }

    public abstract String cutCheck();

}
