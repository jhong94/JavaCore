package Abstract;

public class JaneDoe extends Bob{
    public void name(){
        System.out.println("Hi, my name is Jane");
    }

    public void age(){
        System.out.println("I am 17");
    }
    public void grade(){
        System.out.println("I am in the 11th grade");
    }
    public void amountOfClasses(){
        System.out.println("I am taking 8 classes");
    }
    @Override
    public void school() {
        System.out.println("I go to Midwood High School");
    }
}
