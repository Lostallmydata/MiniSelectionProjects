import java.util.Scanner;
import java.sql.SQLOutput;
public class GradeOutput {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade as an integer. ");
        int grade = scan.nextInt();
        System.out.println(grade);

        if (grade <= 100 && 98 <= grade) {
            System.out.println("A+");
        } else if (grade <= 97 && 93 <= grade) {
            System.out.println("A");
        } else if (grade <= 92 && 90 <= grade) {
            System.out.println("A-");
        } else if (grade <= 89 && 88 <= grade) {
            System.out.println("B+");
        } else if (grade <= 87 && 83 <= grade) {
            System.out.println("B");
        } else if (grade <= 82 && 80 <= grade) {
            System.out.println("B-");
        } else if (grade <= 79 && 78 <= grade) {
            System.out.println("C+");
        } else if (grade <= 77 && 73 <= grade) {
            System.out.println("C");
        } else if (grade <= 72 && 70 <= grade) {
            System.out.println("C-");
        } else if (grade <= 69 && 68 <= grade) {
            System.out.println("D+");
        } else if (grade <= 67 && 63 <= grade) {
            System.out.println("D");
        } else if (grade <= 62 && 60 <= grade) {
            System.out.println("D-");
        } else {
            System.out.println("F");
        }

    }
}