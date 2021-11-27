package Test;

/*
QUESTION 8
    - Write a Java program to get a number from the user and print whether it is positive or negative.
 */

import java.util.Scanner;

public class QuestionEight {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        try{
            System.out.println("Please enter a number:");
            int input = number.nextInt();
            if(input > 0)
            {System.out.println("This is a positive number.");}
            if(input < 0)
            {System.out.println("This is a negative number.");}
            else if(input == 0)
            {System.out.println("This is neither a positive or negative number.");}
        }
        catch (Exception e)
        {System.out.println("Invalid input! Please enter a number.");}
    }
}
