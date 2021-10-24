import java.util.Random;

public class RandomDice {
    public static void main(String[] args){
        int upperbound = 7;
        int lowerbound = 1;

            Random rand = new Random();
            int dice1 = rand.nextInt(upperbound - lowerbound) + lowerbound;
        System.out.println(dice1);
            int dice2 = rand.nextInt(upperbound - lowerbound) + lowerbound;
        System.out.println(dice2);
        if (dice1 == dice2){
            System.out.println("You win!");
        }else {
            System.out.println("You lose!");
        }
    }
}
