import java.util.Scanner;

public class WaterRunsOff {


    public static void main (String[] args){
        //2. How much water runs off the roof

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width of your roof:");
        double width = input.nextDouble();
        System.out.println("Enter the length of your roof:");
        double length = input.nextDouble();
        System.out.println("Enter the number of inches of rainfall:");
        double rainfall = input.nextDouble();

        double cubicInchOfWater = width * length * rainfall;
        double gallonsOfWater = cubicInchOfWater / 231;

        System.out.println(gallonsOfWater);
    }



}
