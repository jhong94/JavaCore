package Example;

public class Fan implements Hockey{
    public static void main(String[] args){
        Fan f = new Fan();
        f.homeGoalScored();
        f.visitingGoalScored();
        f.setHomeTeam();
        f.endOfPeriod();
    }

    private void endOfPeriod() {
        System.out.println(3);
    }

    private void setHomeTeam() {
        System.out.println("Blues");
    }

    @Override
    public void homeGoalScored() {
        System.out.println(12);
    }

    @Override
    public void visitingGoalScored() {
        System.out.println(10);
    }

    @Override
    public void endOfPeriod(int period) {
        System.out.println(3);
    }

    @Override
    public void overtimePeriod(int ot) {
        System.out.println(5);
    }

    @Override
    public void setHomeTeam(String Name) {
        System.out.println("Blues");
    }

    @Override
    public void setVisitingTeam(String name) {
        System.out.println("Reds");
    }
}
