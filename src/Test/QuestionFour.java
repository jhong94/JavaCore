
package Test;

/*
QUESTION 4
// Take weight for user Example 65.7
//Ask the user if the Weight in Kg and lb
// Convert the weight and output the result

Math formula:
Kg to lb: weight * 2.21
 or
lb to Kg: weight / 2.21

Example 65.7 KG => "Your converted weight of 65.7Kg is 144.8437lb"
*/

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner userDiff = new Scanner(System.in);
        try {
            System.out.println("What is your weight?");
            double weight = input.nextDouble();

            System.out.println("Do you measure in KG or LB?");
            String kilo = userDiff.nextLine();

            if (kilo.equals("KG"))
            {System.out.println("This is your weight in LB: " + weight * 2.21 + ".");}
            else if(kilo.equals("LB"))
            {System.out.println();}
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

