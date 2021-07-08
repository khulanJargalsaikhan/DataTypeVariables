import java.util.Scanner;

public class CalculateEmployeesPay {

    public static void main(String[] args){
        //4. Calculate employee's pay

        int maxHours = 60;
        int maxRate = 25;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your employee number: ");
        int empNumber = input.nextInt();
        System.out.println("Enter the number of hours worked in a week.: ");
        int numOfHours = input.nextInt();
        System.out.println("Enter the pay rate: ");
        int hourlyRate = input.nextInt();

        if (numOfHours > maxHours || hourlyRate > maxRate) {
            System.out.println("The hours worked field or the hourly rate field is out of range!");
        } else {
            if (numOfHours > 35) {
                double weeklyPay = numOfHours * (hourlyRate * 1.5);
                System.out.println(String.format("Employee number: %d, Hourly rate: %d, Number of hours: %d, Weekly pay: %s", empNumber, hourlyRate, numOfHours, weeklyPay));
            }else{
                int weeklyPay = numOfHours * hourlyRate;
                System.out.println(String.format("Employee number: %d, Hourly rate: %d, Number of hours: %d, Weekly pay: %d", empNumber, hourlyRate, numOfHours, weeklyPay));
            }

        }


    }

}
