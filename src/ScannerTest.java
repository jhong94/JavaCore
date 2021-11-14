import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner numberGrade = new Scanner(System.in);
        System.out.print("Please enter your grade: ");
        int grade = numberGrade.nextInt();
        if (grade >= 90 && grade <= 100){
            System.out.println("You got an A!");
        }else if (grade >= 80 && grade <= 89){
            System.out.println("You got a B!");
        }else if (grade >= 65 && grade <= 79){
            System.out.println("You got a C!");
        }else if (grade >= 0 && grade <= 64){
            System.out.println("You failed!");
        }
    }
}
