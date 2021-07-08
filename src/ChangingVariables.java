import java.util.Scanner;

public class ChangingVariables {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        // Changing Variables
        System.out.println("Enter your current salary: ");
        double originalSalary = input.nextInt();
        input.nextLine();

        double firstYearRaise = originalSalary * 0.1;
        double firstYearSalary = originalSalary + firstYearRaise;
        double secondYearRaise = firstYearSalary * 0.1;
        double secondYearSalary = firstYearSalary + secondYearRaise;
        double thirdYearRaise = secondYearSalary * 0.1;
        double thirdYearSalary = secondYearSalary + thirdYearRaise;
        double forthYearRaise = thirdYearSalary * 0.1;
        double forthYearSalary = thirdYearSalary + forthYearRaise;
        double fifthYearRaise = forthYearSalary * 0.1;
        double fifthYearSalary = forthYearSalary + fifthYearRaise;

        System.out.println(fifthYearSalary);


        // Getting and storing user input

        System.out.println("Enter your initial: ");
        String firstInitial = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter your house number: ");
        int houseNumber = input.nextInt();
        System.out.println("Enter your street name: ");
        input.nextLine();
        String streetName = input.nextLine();
        System.out.println("Enter your street type: ");
        String streetType = input.nextLine();
        System.out.println("Enter your city: ");
        String city = input.nextLine();

        //"P Sherman 42 Wallaby Way Sydney"
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);



    }
}
