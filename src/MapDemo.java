import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args){
        HashMap<String, Double> playerAvg= new HashMap<>();

        playerAvg.put("Curry, Stephen" , 32.0);
        playerAvg.put("Beal, Bradley" , 31.3);
        playerAvg.put("Lillard, Damien" , 28.8);
        playerAvg.put("Embiid, Joel ", 28.5);
        playerAvg.put("Antetokounmpo, Giannis ", 28.1);

        System.out.println(playerAvg); //doesn't guarantee it is printed in a specific order
        System.out.println(playerAvg.get("Curry, Stephen")); //returns value matching the key
        System.out.println(playerAvg.containsKey("Beal, Bradley")); //returns true because this key exists in the map
        System.out.println(playerAvg.containsKey("George, Paul")); // returns false because this key does not exist in the map
        System.out.println(playerAvg.containsValue(28.1)); //value exists within the map so it returns true
        System.out.println(playerAvg.containsValue(25.2)); //value does not exist within the map, so it returns false

        playerAvg.put("Embiid, Joel", 29.0); //replaces the previous value, updates the key value if it already exists within the map
        System.out.println(playerAvg);

        playerAvg.replace("Lillard, Damien", 30.0); //replaces the value within the map. It can only replace a value that already exists in
        //the map. If it doesn't exist, nothing will happen, whereas .put, even if it doesn't exist, it will put the key-value into the map
        System.out.println(playerAvg);

        playerAvg.putIfAbsent("Doncic, Luka", 27.7); //will only add the key-value pair if it doesn't already exist
        System.out.println(playerAvg);

        playerAvg.putIfAbsent("Curry, Stephen", 27.7); //will only add the key-value pair if it doesn't already exist
        System.out.println(playerAvg);

        playerAvg.remove("Doncic, Luka"); //removes the key-value pair from the map
        System.out.println(playerAvg);
    }
}
