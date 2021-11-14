package EnCapEx;

public class RunEncap {
    public static void main(String[] args){
        EncapExample encap = new EncapExample();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.println("Name: " + encap.getName() + " Age: " + encap.getAge());
    }
}
