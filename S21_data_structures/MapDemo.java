package S21_data_structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.awt.Color;
import S05_user_inputs.Terminal;

public class MapDemo {
    public static void main(String[] args) {
        Terminal.clear();

        // Map is a collection of key-value pairs
        // Map is similar to dictionary in Python

        Map<String, Color> map = new HashMap<>();
        map.put("Daniel", Color.RED);
        map.put("Michael", Color.GREEN);
        map.put("Conor", Color.BLUE);
        map.put("Sarah", Color.YELLOW);
        map.remove("Sarah");

        System.out.println(map);

        Set<String> keys = map.keySet();
        for (String key : keys) {
            Color value = map.get(key);
            System.out.println(key + " -> " + value);
        }
    }
}
