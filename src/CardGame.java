import java.util.Locale;
import java.util.Scanner;

public class CardGame {
    public static void main(String[] args){
        //Card Game: Process a Pair of Numbers

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the CARD GAME!");

        int sum = 0;
        int num1 = 0;
        int num2 = 0;


            System.out.println("Enter 1 for numerical value or Enter 2 for face cards: ");
            int optionNum = input.nextInt();
            input.nextLine();

            if (optionNum == 1){
                System.out.println("Enter number 1: ");
                num1 = input.nextInt();
                System.out.println("Enter number 2: ");
                num2 = input.nextInt();

            }else{
                    System.out.println("Enter a face cards (must be J,Q,K or A): ");
                    String card = input.nextLine().toUpperCase(Locale.ROOT);
                    if (card.equals("A")){
                        System.out.println("Enter 1 if you want to designate it as 1, or Enter 11 to designate it as 11: ");
                        int designateNum = input.nextInt();
                        if (designateNum == 1) {
                            num1 = 1;
                            System.out.println("Enter number 2: ");
                            num2 = input.nextInt();
                        }else {
                            num1 = 11;
                            System.out.println("Enter number 2: ");
                            num2 = input.nextInt();

                        }

                    }else{
                        num1 = 10;
                        System.out.println("Enter number 2: ");
                        num2 = input.nextInt();
                    }

                }


        sum = num1 + num2;
        if (sum == 21) {
            System.out.println("sum is: " + sum + "*");
            System.out.println("Thank you! Goodbye.");
        }

        else if (sum == 0) {
            System.out.println("Thank you! Goodbye.");
        }

        else {
            System.out.println("sum is: " + sum);
            System.out.println("Thank you! Goodbye.");
        }


    }
}
