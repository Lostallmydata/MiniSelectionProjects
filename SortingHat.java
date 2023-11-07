import java.util.Scanner;
public class SortingHat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to hogwarts! It is time to select your house.");
        System.out.println("Please enter your name:");
        String name = scan.nextLine();
        System.out.println("Answer the following questions with 'yes' or 'no'");
        System.out.println("In a burning building, Would you Run in to help the victims? ");
        String answer1 = scan.nextLine();
        if(answer1.equals("yes")){
            System.out.println("Congratulations " + name + ",");
            System.out.println("you are a Gryffindor!");
        }
        else{
            System.out.println(" would you rather call the fire Department and help out from a distance? ");
            String answer2 = scan.nextLine();
            if(answer2.equals("yes")){
                System.out.println("Congratulations " + name + ",");
                System.out.println("you are a Ravenclaw!");

            }
            else{
                System.out.println(" or would you rather learn what went wrong and create prevention plan?");
                String answer3 = scan.nextLine();
                if(answer3.equals("yes")){
                    System.out.println("Congratulations " + name + ",");
                    System.out.println("you are a Hufflepuff!");

                }
                else{
                    System.out.println("Congratulations " + name + ",");
                    System.out.println("you are a Slytherin!");


                }

            }
        }



    }

}
