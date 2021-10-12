public class Variables {
        static int c = 30; //STATIC VARIABLE, can be accessed directly
    int a = 10; //INSTANCE VARIABLE, can only be accessed through the method
    public static void main(String[] args){
        Variables INSTANCE = new Variables();
        int b = 20; //LOCAL VARIABLE, can be accessed directly
        System.out.println("Instance Variable = " + INSTANCE.a);
        System.out.println("Local Variable = " + b);
        System.out.println("Static Variable= " + Variables.c);
    }

}
