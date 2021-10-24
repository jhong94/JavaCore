import java.util.Scanner;

public class GradeTest{
    public static void main(String[] args){
        Scanner numberGrade = new Scanner(System.in);
        int grade = numberGrade.nextInt();
        System.out.println(getGrade(grade));
    }
    public static String getGrade(int gradeNum){
        int quotient = gradeNum / 10;

        String letterGrade = "";

        switch(quotient){
            case 10: case 9: letterGrade = "A";
            break;
            case 8: letterGrade = "B";
            break;
            case 7: case 6: letterGrade = "C";
            break;
            default: letterGrade = "You failed";
        }
        switch(gradeNum){
            case 60: case 61: case 62: case 63: case 64: letterGrade = "You failed";
        }

        return letterGrade;
    }
}

