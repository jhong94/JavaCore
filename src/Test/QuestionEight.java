package Test;

import java.util.Scanner;

public class TestAnswerEight {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        try{
            System.out.println("Please enter a number:");
            int input = number.nextInt();
            if(
                    input > 0
            )
                System.out.println("This is a positive number.");
            else if(
                    input < 0
            )
                System.out.println("This is a negative number.");
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
