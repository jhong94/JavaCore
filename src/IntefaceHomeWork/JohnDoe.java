package IntefaceHomeWork;

public class JohnDoe implements Gym {
    @Override
    public void squat() {
        System.out.println("I squat 315lbs");
    }

    @Override
    public void deadLift() {
        System.out.println("I deadlift 405lbs");
    }

    @Override
    public void bench() {
        System.out.println("I bench 225lbs");
    }

    @Override
    public void overheadPress() {
        System.out.println("I overhead press 135lbs");
    }
}
