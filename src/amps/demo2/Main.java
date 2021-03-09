package amps.demo2;

import java.util.*;
import java.util.Map.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);


//        CustomEntry<String, Integer> objectObjectCustomEntry1 = new CustomEntry<>("one", 1);
//        CustomEntry<String, String> objectObjectCustomEntry2 = new CustomEntry<>("one", "1");


        Set<Entry<String, Integer>> entries = map.entrySet();
        Iterator<Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Entry<String, Integer> next = iterator.next();
            if (next.getKey().equals("one")) {
                iterator.remove();

            }

        }


        System.out.println(map);
    }
}

class CustomEntry<K, V> {
    private K key;
    private V value;

    public CustomEntry() {
    }

    public CustomEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
