package Abstract;

public class Students extends JaneDoe {
    public static void main(String[] args){
        Bob student1 = new Bob();
        student1.age();
        student1.grade();
        student1.amountOfClasses();
        student1.school();

        JaneDoe student2 = new JaneDoe();
        student2.age();
        student2.grade();
        student2.amountOfClasses();
        student2.school();
    }
}
