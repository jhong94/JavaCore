package Test;

/*
QUESTION 9
    - Use for loop to add the following number from array [1,3,5,9,8]
 */

public class QuestionNine {
    public static void main(String[] args){
        int[] questionNine = {1, 3, 5, 9, 8};
        for(int i = 0; i < questionNine.length; i++){
            System.out.println(questionNine[i]);
        }
        int total = 0;
        for(int i = 0; i < questionNine.length; i++){
            total += questionNine[i];
        }
        System.out.println("Total is: " + total);
    }
}
