import java.lang.reflect.Array;

public class ArrayDays {
    public static void main(String[] args){
        /*String[] Days = new String[7];
        Days[0] = "Sunday";
        Days[1] = "Monday";
        Days[2] = "Tuesday";
        Days[3] = "Wednesday";
        Days[4] = "Thursday";
        Days[5] = "Friday";
        Days[6] = "Saturday";
        System.out.println(Days[0]);*/

       /*double[] myList = {1.9, 2.9, 3.4, 3.5};
       for(int i = 0; i < myList.length; i++){
           System.out.println(myList[i] + " ");
       }
       double total = 0;
       for(int i = 0; i < myList.length; i++){
           total += myList[i];
       }
        System.out.println("Total is " + total);

       double max = myList[0];
       for(int i = 1; i < myList.length; i++){
           if(myList[i] > max) max = myList[i];
       }
        System.out.println("Max is " +  max);*/

        double[] myList = {1.9, 2.9, 3.4, 3.5};
        for(double element: myList){
            System.out.println(element);
        }

    }
}



