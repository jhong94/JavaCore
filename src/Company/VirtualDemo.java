package Company;

public class VirtualDemo {
    public static void main(String[] args){
        Salary s = new Salary("Mohd Mohtashim", "Ambetha, UP", 3, 3600.00);
        Employee e = new Salary("Johns Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference --");
        e.mailCheck();
    }
}
/*
Two salary objects were instantiated here, one using a Salary reference using "s", and the other using an Employee reference "e".
While invoking s.mailCheck(), the compiler sees maikCheck() in the Salary class at compile time and Java invokes mailCheck() in the Salary class at run time.
mailCheck() on "e" is different bc "e" is an Employee reference. When the compiler sees e.mailCheck(), the compiler sees the mailCheck() in the salary class.
This behavior is called a "virtual method invocation" and these methods are referred to as virtual methods.An overridden method is invoked at run time, no matter what data type the reference is that was used in the source code at compile time.
 */