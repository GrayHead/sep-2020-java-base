package lesson5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {

//        Map<String, Integer> map = new HashMap<>();
//        map.put("one", 1);
//        map.put("two", 2);
//        map.put("three", 3);
//        System.out.println(map);


        Map<String, User> map = new HashMap<>();
        map.put("doctor", new User(1, "roman"));
        map.put("baklan", new User(2, "anton"));
        map.put("petya", new User(3, "sasha"));
        map.put("borya", new User(4, "sasha"));
        map.putIfAbsent("borya", new User(5, "dshsjfa"));

        System.out.println(map);

        User borya = map.get("borya");
        System.out.println(borya);

        map.getOrDefault("AHAGFDH", null);

        Set<String> keys = map.keySet();
        System.out.println(keys);
        Collection<User> values = map.values();
        System.out.println(values);


    }
}
