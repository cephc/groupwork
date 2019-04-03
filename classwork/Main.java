package classwork;

public class Main {
    public static void main(String[] args) {

        HourlyEmployee one = new HourlyEmployee("Danielle", "Johnson", 220987336, 8.75, 35.09,  "12/02/1998");
        System.out.println(one.calculatePay());
        System.out.println("========================================================");

        SalariedEmployee oneS = new SalariedEmployee("Heather", "Jones", 222093794, "10/23/2001", 2500.00);
        System.out.println(oneS.calculatePay());
        System.out.println("========================================================");

        CommissionedEmployee oneC = new CommissionedEmployee("Henry", "Lou", 222346775, 0.20, 8000, "06/20/16");
        System.out.println(oneC.calculatePay());
        System.out.println("========================================================");

        BasePlusCommissionedEmployee oneB = new BasePlusCommissionedEmployee("Malachi", "Dendy", 221984734, .10, 5000.00, 3000.00, "05/13/2013");
        System.out.println(oneB.calculatePay());





    }
}
