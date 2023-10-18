import java.util.Scanner;
import java.sql.SQLOutput;
import java.lang.Math;
public class Lottery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a 2 digit number.");
        int number = scan.nextInt();
        int lotNum = (int) (Math.random() * 90 + 10);
        System.out.println("The lotto number is: " + lotNum);
        int inTenVal = (int) (number / 10);
        int inOneVal = (int) (number % 10);
        int loTenVal = (int) (lotNum / 10);
        int loOneVal = (int) (lotNum % 10);

        if (lotNum == number) {
            System.out.println("JACKPOT!!" + "\n" + "You win $10,000!!");
        } else if ((inTenVal == loTenVal) && (inOneVal != loOneVal) || ((inTenVal != loTenVal) && (inOneVal == loOneVal))) {
            System.out.println("you got one number correct. You win 500$!");

        } else if ((inTenVal == loOneVal) && (inOneVal != loTenVal) || ((inTenVal != loOneVal) && (inOneVal == loTenVal))) {
            System.out.println("you got one number correct. You win 500$!");

        }
        else if ((inTenVal == loOneVal) && (inOneVal == loTenVal) || ((inTenVal == loOneVal) && (inOneVal == loTenVal))) {
            System.out.println("you got both numbers correct. You win 1000$");

        }
        else {
            System.out.println("you didnt get any number correct. You win nothing.");
        }

    }
}
