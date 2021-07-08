import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        /*
    Miles per Gallon is considered to be the average mileage of a motor
    vehicle which uses Petrol or Diesel as fuel. Miles represents the distance
    the vehicle traveled in the units of Miles. Write a program to compute a mileage where mileage = miles/gallons.

     */

        System.out.println("Enter traveled miles: ");
        Scanner input = new Scanner(System.in);
        int miles = input.nextInt();
        System.out.println("Enter gallons: ");
        int gallons = input.nextInt();

        int mileage = miles / gallons;

        System.out.println("The result is " + mileage + " miles/gallon.");




    }

}
