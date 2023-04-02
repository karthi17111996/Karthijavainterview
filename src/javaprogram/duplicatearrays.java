package javaprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class duplicatearrays {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("apple");
        list.add("orange");

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String str : list) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        System.out.println("Duplicate values in the list are: ");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appeared " + entry.getValue() + " times.");
            }
        }
    }
}
