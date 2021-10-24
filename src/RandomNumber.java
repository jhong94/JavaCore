import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        int upperbound = 11;
        int lowerbound = 5;

        Random rand = new Random();
        int random_integer = rand.nextInt(upperbound - lowerbound) + lowerbound;
        System.out.println(random_integer);
    }
}
