package groupwork.classwork;

import javax.jws.soap.SOAPBinding;

public class Main {
    public static void main(String[] args) {

        HourlyEmployee one = new HourlyEmployee("Danielle", "Johnson", 220987336, 8.75, 50,  "12/02/1998");
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
        System.out.println("========================================================");

        Supplier oneU = new Supplier("Dasani", "Rogers", 94747503, 195, 5.85, "12/09/1995");
        System.out.println(oneU.calculatePay());
        System.out.println("========================================================");

        IPayable [] iPayables = new IPayable[]{one, oneS, oneC, oneB, oneU};

        for (IPayable pay:iPayables){
            System.out.println(pay.cutCheck());
        }

    }
}
