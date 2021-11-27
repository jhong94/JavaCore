package Test;

/*
QUESTION 7
    Print which number (including index) is multiple of 3 from the following list `13, 3, 8, 9, 6, 15`
 */

public class QuestionSeven {
    public static void main(String[] args){
        int multiple[] = {13, 3, 8, 9, 6, 15};
        System.out.println("These are multiples of 3: ");
        for(int i = 0; i < multiple.length; i++){
            if(multiple[i] % 3 == 0)
                System.out.println(multiple[i]);
        }
    }
}
