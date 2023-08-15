package Intermediate;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);

        System.out.println("Size of map is: " + map.size());
        System.out.println(map);

        if (map.containsKey("a")) {
            Integer a = map.get("a");  // Gets integer value corresponding to key of "a" in map
            System.out.println("value for key" + " \"a\" is: " + a );  // \" Just allows " to be used in string
        }

        for(String key : map.keySet()) {  // Iterates every key in the hashmap "map"
            System.out.println("key: " + key + ", value: " + map.get(key)); 
        }

        for(Entry<String, Integer> entry : map.entrySet()) {  // Rather than getting the key and using it to get the value as above, we get both key and value
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}

