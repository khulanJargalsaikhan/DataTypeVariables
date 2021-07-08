import java.util.Scanner;

public class FenceCost {
    public static void main(String[] args){
        // 5. How much should a fence cost?

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width of the fence: ");
        int width = input.nextInt();
        System.out.println("Enter the length of the fence: ");
        int length = input.nextInt();

        int woodenFencePrice = 25;
        int chainFencePrice = 15;
        int gatesPrice = 150;
        int permitPrice = 50;
        int taxRate = 6;

        int perimeter = 2 * (width + length);

        System.out.println("What type of fencing do you want to use: (type 1 for Wooden fencing\n" +
                "type 2 for Chain-link fencing");
        int typeFenceChosen = input.nextInt();
        if (typeFenceChosen == 1) {
            int costBeforeTax = perimeter * 25 + 150;
            double taxCost = (perimeter * 25 + 150) * 0.06;
            double cost = costBeforeTax + taxCost + 50;
            System.out.println("The Fence cost is: " + cost);
        } else {
            int costBeforeTax = perimeter * 15 + 150;
            double taxCost = (perimeter * 15 + 150) * 0.06;
            double cost = costBeforeTax + taxCost + 50;
            System.out.println("The Fence cost is: " + cost);
	};



    }
}
