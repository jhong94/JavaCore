public class ThreeDArray {
    public static void main(String[] args){
        double [][][] threeDArray =
                {
                        {{1.1, 2.1, 3.1}, {1.2,2.2, 3.2}}, // i = 0 // {1.1, 2.1, 3.1} =>  j = 0 => 1.1 => k=0
                        {{4.1, 5.1, 6.1}, {4.2,5.2, 6.2}}, // i = 1
                        {{7.1, 8.1, 9.1}, {7.2,8.2, 9.2}}  // i = 2
                };

        for(int i = 0 ; i < threeDArray.length; i++){
            for(int j = 0; j < threeDArray[i].length; j++){
                System.out.print("[");
                for(int k = 0; k <= threeDArray[j].length; k++){
                    System.out.print(threeDArray[i][j][k]);
                    if(k != threeDArray[j].length){
                        System.out.print(",");
                    }
                }
                System.out.print("]");
                if(j != threeDArray[i].length - 1){
                    System.out.print(",");
                }
                System.out.println();
            }
        }
    }
}
