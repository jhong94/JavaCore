package IntefaceHomeWork;

public class App {
    public static void main(String[] args){
        Gym [] workout = {
                new JohnDoe(),
                new JaneDoe()
        };
        for (int i = 0; i < workout.length; i++){
            workout[i].deadLift();
        }
    }
}
