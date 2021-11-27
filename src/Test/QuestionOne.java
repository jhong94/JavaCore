package Test;

/*
QUESTION 1

Take two user inputs and output
- Average
- Example : 5, 7 and the output is
- The average of 5 and 7 is 6

- Which number is bigger
- 7 is greater than 5
*/

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args){
        Scanner twoNum = new Scanner(System.in);
        try{
            System.out.println("Enter two numbers: ");
            int firstNum = twoNum.nextInt();
            int secondNum = twoNum.nextInt();

            int avg = (firstNum + secondNum) / 2;
            System.out.println("This is the average of the two numbers you entered: " + avg);
            if(firstNum < secondNum)
            {System.out.println("This is the larger value: " + secondNum);}
            else if(secondNum < firstNum)
            {System.out.println("This is the larger value: " + firstNum);}
            else{System.out.println("These numbers are the same!");}
        }
        catch(Exception e){
            System.out.println("That is an invalid input!");
        }
    }
}
