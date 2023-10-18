import java.util.Scanner;
import java.sql.SQLOutput;
import java.lang.Math;
public class IpAdress {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first octet");
        int oct1 = scan.nextInt();
        System.out.println("Please enter the second octet");
        int oct2 = scan.nextInt();
        System.out.println("Please enter the third octet");
        int oct3 = scan.nextInt();
        System.out.println("Please enter  the fourth octet");
        int oct4 = scan.nextInt();
         if(oct1 > 255){
             System.out.println("the first octet is incorrect.");
         }
         if(oct2 > 255){
             System.out.println("the second octet is incorrect.");
         }
         if(oct3 > 255){
             System.out.println("the third octet is incorrect.");
         }
         if(oct4 > 255){
             System.out.println("the fourth octet in incorrect.");
         }
         if((oct1 + oct2 + oct3 + oct4) <= 1020){
             System.out.println("IP Adress: " + oct1 + "." + oct2 + "." + oct3 + "." + oct4);
         }
    }
}
