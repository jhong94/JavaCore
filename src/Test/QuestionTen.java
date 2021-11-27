package Test;

    /*
QUESTION 10
    Is vowel Solution
 */

import java.util.Scanner;

public class QuestionTen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter: ");
        char vowelOrNot = input.next().charAt(0);

        if(vowelOrNot == 'a' || vowelOrNot == 'e' || vowelOrNot == 'i' || vowelOrNot == 'o' || vowelOrNot == 'u' || vowelOrNot == 'y')
        {System.out.println(vowelOrNot + " is a vowel.");}

        else{System.out.println(vowelOrNot + " is a consonant.");}
    }
}
