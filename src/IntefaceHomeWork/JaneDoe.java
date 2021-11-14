package IntefaceHomeWork;

public class JaneDoe implements Gym{
    @Override
    public void squat() {
        System.out.println("I squat 225lbs");
    }

    @Override
    public void deadLift() {
        System.out.println("I deadlift 315lbs");
    }

    @Override
    public void bench() {
        System.out.println("I bench 135lbs");
    }

    @Override
    public void overheadPress() {
        System.out.println("I overhead press 100lbs");
    }
}
