import java.sql.SQLOutput;

public class BasicSyntax {
    /*This is a comment
     * With multiple lines
     */
    public static void main(String []args) {
        Student myStudent = new Student ();
        myStudent.firstName = "Dwight";
                myStudent.lastName = "Schrute";
                        myStudent.gpa = 3.8;
                        myStudent.major = "Business";
                        myStudent.age = 24;
                        myStudent.onProbation = false;
        Student myStudent2 = new Student ();
            myStudent2.firstName = "Jim";
                myStudent2.lastName = "Halpert";
                    myStudent2.gpa = 2.8;
                        myStudent2.major = "Business";
                            myStudent2.age = 24;
                                myStudent2.onProbation = true;
        System.out.println(myStudent.firstName);
        System.out.println(myStudent.age);
        System.out.println(myStudent.lastName);
    }
}
