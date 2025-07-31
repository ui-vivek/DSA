package day6;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        String str = "vivekeekivg";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                continue;
            Integer count = map.get(str.charAt(i));
            if (count == null) {
                map.put(str.charAt(i), 1);
            } else {
                count += 1;
                map.put(str.charAt(i), count);
            }
        }
        // Use the keySet() method if you only want the keys
        for (int i : map.keySet()) {
            System.out.print((char) i);
        }
        System.out.println();
        // Use the values() method if you only want the values
        for (int i : map.values()) {
            System.out.print(i);
        }

        System.out.println();
        //get both key and values
        for(int i:map.keySet()){
           System.out.println("key: " + (char)i + " value: " + map.get((char)i));
        }
    }
}
