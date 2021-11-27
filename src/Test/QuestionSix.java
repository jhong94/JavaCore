package Test;

/*
QUESTION 6
// Check the current state of the car
Ask the user if the car is ON
 => If the user says ON, then output "You are all set to go. Drive carefully"
 => If the user says NO, then output "Please start the car before proceeding"
*/

import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args){
        Scanner userCar = new Scanner(System.in);
            System.out.println("Is the car on?");
            String carCond = userCar.next();

            if(carCond.equals("On"))
            {System.out.println("You are all set to go. Drive carefully.");}
            else if(carCond.equals("No"))
            {System.out.println("Please start the car before proceeding");}

            else{System.out.println("Please enter a valid input.");}
    }
}
