package Test;

/*
QUESTION 5
// Given the following 2d array, output Name, age and address

String[][] students = { { "Jon Doe", "21", "123 address" }, { "Barak Obama", "22", "567 address" } }

Output:
Name : Jon Doe
Age: 21
Address: 23 address
" ***** "
Name : Barak Obama
Age: 22
Address: 567 address
" ***** "
*/

public class QuestionFive {
    public static void main(String[] args){
        String[][] students = { { "Jon Doe", "21", "123 address" }, { "Barak Obama", "22", "567 address" } };
        for(int i = 0; i < students.length; i++){
            for(int j = 0; j < students[i].length; j++){
                if(j == 0)
                {System.out.print("Name: ");}
                else if(j == 1)
                {System.out.print("Age: ");}
                else if(j == 2)
                {System.out.print("Address: ");}
                System.out.println(students[i][j]);
            }
        }


    /*Output:
    Name : Jon Doe
    Age: 21
    Address: 23 address
" ***** "
    Name : Barak Obama
    Age: 22
    Address: 567 address
" ***** "*/
    }
}
