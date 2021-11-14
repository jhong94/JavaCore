import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeTest{
    public static void main(String[] args){
        Scanner numberGrade = new Scanner(System.in);
        try{
            int grade = numberGrade.nextInt();
            System.out.println(getGrade(grade));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter a number grade between 0 and 100.");
        }
    }
    public static String getGrade(int gradeNum){
        int quotient = gradeNum / 10;

        String letterGrade = "";

        switch(quotient){
            case 10: case 9: letterGrade = "You got an A! Good job!";
            break;
            case 8: letterGrade = "You got a B! Not bad!";
            break;
            case 7: case 6: letterGrade = "You got a C! Maybe try harder next time.";
            break;
            default: letterGrade = "You failed! oof.";
        }
        switch(gradeNum){
            case 60: case 61: case 62: case 63: case 64: letterGrade = "You failed! oof.";
        }

        return letterGrade;
    }
}

