//functional example
public class VariableTypes {
    public void pupAge() {
        int age =0;
        age = age + 7;
        System.out.println("Puppy age is :" + age);
    }
    public static void main(String[] args){
        VariableTypes test = new VariableTypes();
        test.pupAge();
    }
}
//non-functional example due to the "age" variable not being initialized
/*public class VariableTypes {
    public void pupAge() {
        int age;
        age = age + 7;
        System.out.println("Puppy age is:" + 7);
    }

    public static void main(String[] args){
        VariableTypes test = new VariableTypes();
        test.pupAge();
    }
}*/