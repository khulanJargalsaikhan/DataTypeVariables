import java.util.Locale;
import java.util.Scanner;

public class HoleInTen {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a product code: ");
        String code = input.nextLine().toUpperCase(Locale.ROOT);

        switch (code) {
            case "BALL":
                System.out.println("Description: Golf Balls (1 dozen), Price: $38.00");
                break;
            case "DRV01":
                System.out.println("Description: Big Bertha Driver, Price: $449.95");
                break;
            case "DRV02":
                System.out.println("Description: Vaporizer Driver, Price: $375.00");
                break;
            case "DRV03":
                System.out.println("Description: Fly-Z Driver, Price: $179.00");
                break;
            case "SET01":
                System.out.println("Description: Project Manager Gold Club Set, Price: $179.00");
                break;
            case "SET02":
                System.out.println("Description: Junior VP Golf Club Set, Price: $225.00");
                break;
            case "SET03":
                System.out.println("Description: Executive Golf Club Set, Price: $299.9");
                break;
            case "SET04":
                System.out.println("Description: CEO Golf Club Set, Price: $374.95");
                break;
            case "SET05":
                System.out.println("Description: Chairman of the Board Club Set, Price: $495.00");
                break;
            default:
                System.out.println("Invalid code, Try again!");
        }
    }


}
