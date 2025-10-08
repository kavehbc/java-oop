package S10_hashmap;
import java.util.HashMap;
import java.util.Map;

public class HashMapJava {

    public static void main(String[] args) {
        System.out.println("HashMap Example");

        // hashmap is a key-value pair data structure
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // equivalent in JSON / Python dictionary
        // {"One": 1, "Two": 2, "Three": 3}

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // get access to specific value by key
        System.out.println("Value for key 'Two': " + map.get("Two"));

        // check if a key exists
        System.out.println("Contains key 'Three': " + map.containsKey("Three"));

        // remove a key-value pair
        map.remove("One");

        // update a value by key
        map.put("Two", 22);

    }
}