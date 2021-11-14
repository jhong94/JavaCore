public class TwoDArray {
    public static void main(String[] args){
        int[][] coordinates = { {0,1}, {1,0}, {1,1}};
        for(int i = 0; i < coordinates.length; i++){
            System.out.print("[");
            for(int j = 0; j < coordinates[i].length; j++){
                System.out.print(coordinates[i][j]);
                if(j != coordinates[i].length - 1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if(i != coordinates.length - 1){
                System.out.print(",");
            }
            System.out.println();
        }
    }
}
