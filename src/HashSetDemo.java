import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet<String> hashDemo = new HashSet<String>();
        hashDemo.add("Pitbull");
        hashDemo.add("Chihuahua");
        hashDemo.add("Pug");
        hashDemo.add("German Shepard");
        hashDemo.add("Shiba Inu");

//        Iterator<String> it = hashDemo.iterator(); -- iterates through the hashset
//        while(it.hasNext()){
//            System.out.println(it.next());
//        } -- while loop .hasNext continues printing as long as there is another value to print out

        //hashDemo.clear(); -- removes all objects from the collection
        //hashDemo.remove("Pug"); -- removes a specified object from the collection, in this case, pug
        //System.out.println(hashDemo.contains("Pug")); -- returns true if a specified object is an element within the collection
        //System.out.println(hashDemo.isEmpty()); -- returns true if the collection has no elements, otherwise returns false
        //System.out.println(hashDemo.size()); -- returns the number of elements in the collection

        //System.out.println("These are my favorite dog breeds: " + hashDemo);
        //System.out.println(hashDemo.hashCode());
    }
}
