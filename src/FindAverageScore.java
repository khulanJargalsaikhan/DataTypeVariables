import java.util.Scanner;

public class FindAverageScore {

    public static void main (String[] args){
        // 1. Find the average score

        int[] arrScore = new int[10];
        int sumScore = 0;
        int aveScore = 0;

        Scanner input = new Scanner(System.in);


        for(int i=0; i<10; i++){
            System.out.println("Enter exam score");
            int score = input.nextInt();
            arrScore[i] = score;
        }

        for(int i=0; i<arrScore.length; i++){
            sumScore = sumScore + arrScore[i];
        }

        aveScore = sumScore / arrScore.length;

        for(int score : arrScore) {
            System.out.println("The exam score is: " + score);
        }

        System.out.println("---------------------------------");
        System.out.println("The average score is: " + aveScore);


    }


}
