package Test;

import java.util.Scanner;

/*
QUESTION 2
Given User inputs a String - "WORLD"
- Reverse string without using any inbuilt methods
- Output: "DLROW"
*/
public class QuestionTwo {
    public static void main(String[] args){
        Scanner word = new Scanner(System.in);
        try {
            System.out.println("Enter a word: ");
            String userWord = word.nextLine();
            int lastIndex = userWord.length() - 1;
            for(int i = lastIndex; i < userWord.length(); i--)
            {System.out.println(userWord.charAt(i));}
        }
        catch(Exception StringIndexOutOfBoundsException){
        }
    }
}
