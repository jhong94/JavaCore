package Test;

/*
QUESTION 3
// Given a use provides a sentence "I love Java"
Output how many words are in the sentence

HINT: you will have to use split method and split by userString.split(" ");
*/

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args){
        Scanner userSentence = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String userString = userSentence.nextLine();
        String[] arr = userString.split(" ", 0);
        int lastIndex = arr.length - 1;
        for(int i = 0; i < arr.length; i++){
            if(i == lastIndex)
            {System.out.println("This sentence has: " + arr.length + " word(s).");}
        }
        }
}
