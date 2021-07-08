import java.util.Scanner;

public class CustomerRecord {
    public static void main (String[] args){
        //3. Process customer record

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Enter the amount of your purchase: ");
        double purchaseAmount = input.nextDouble();
        System.out.println("Enter the tax code (0-3): ");
        int taxCode = input.nextInt();



        if (taxCode == 0) {
            double tax = 0.0;
            double totalAmount = purchaseAmount + tax;
            System.out.println("name: " + name + " purchase amount: " + purchaseAmount + " sales tax: " + tax + "%" + " total amount: "+totalAmount);

        } else if  (taxCode == 1) {
            double tax = (purchaseAmount * 3) / 100;
            double totalAmount = purchaseAmount + tax;
            System.out.println("name: " + name + " purchase amount: " + purchaseAmount + " sales tax: " + tax + "%" + " total amount: "+totalAmount);

        } else if  (taxCode == 2) {
            double tax = (purchaseAmount * 5) / 100;
            double totalAmount = purchaseAmount + tax;
            System.out.println("name: " + name + " purchase amount: " + purchaseAmount + " sales tax: " + tax + "%" + " total amount: "+totalAmount);

        } else if (taxCode == 3) {
            double tax = (purchaseAmount * 7) / 100;
            double totalAmount = purchaseAmount + tax;
            System.out.println("name: " + name + " purchase amount: " + purchaseAmount + " sales tax: " + tax + "%" + " total amount: "+totalAmount);
        };




    }
}
