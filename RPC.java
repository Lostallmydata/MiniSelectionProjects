import java.util.Scanner;
import java.sql.SQLOutput;
import java.lang.Math;
public class RPC {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Rock(0), Paper(1), Or Scissors?(2)");
    int choice = scan.nextInt();
    if (choice == 1){
        System.out.println("You chose Paper.");
    }
    else if(choice == 0){
        System.out.println("You chose Rock.");
    }
    else{
        System.out.println("You chose Scissors");
    }
    int compChoice =(int)(Math.random()*3);
    if(choice == compChoice){
        System.out.println("the computer chose the same thing you did.");
        System.out.println("Its a draw!");
    }
    else if(choice == 0 && compChoice == 2) {
        System.out.println("The computer chose Paper.");
        System.out.println("You win!");
    }
    else if(choice == 1 && compChoice == 0){
        System.out.println("The computer chose Rock.");
        System.out.println("You win!");
    }
    else if(choice == 2 && compChoice == 1){
        System.out.println("The computer chose Paper");
        System.out.println("You win!");
    }
    else if(choice == 1 && compChoice == 2) {
        System.out.println("The computer chose Scissors");
        System.out.println("You lose :(");
    }
        else if (choice == 0 && compChoice == 1) {
        System.out.println("The computer chose Paper.");
        System.out.println("You lose :(");
    }
        else if(choice == 2 && compChoice == 0){
        System.out.println("The computer chose Rock.");
        System.out.println("You lose :(");
    }






    }
}
