import java.util.Scanner;

public class StringAssignments {

    public static void main(String[] args) {
        // Using substring(), length(), and charAt()

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        System.out.println("Enter a number as an index: ");
        int index = input.nextInt();

        System.out.println("The length of alphabet is: " + word.length());
        System.out.println("The substring from 0 to 3 is: " + word.substring(0,3));






    }

}