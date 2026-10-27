package ThreadingCollections;

import java.util.HashMap;
import java.util.Map;

public class Map_Demo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // hashtabel is same as hashmap but it is synchronized
        map.put("saddam", 86);
        map.put("Rehan Jaffery", 76);
        map.put("Zaki Nafees", 69);
        map.put("Motsim", 96);
        map.put("Shadab", 56);
        map.put("Shadab", 86); // if key already exist then key's value will be updated

        System.out.println(map);

        System.out.println(map.keySet());

        System.out.println(map.values());

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
