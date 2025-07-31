package day6;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();

        map.put('a', 5);
        map.put('z', 0);
        map.put('e', 9);
        map.put('b', 1);
        map.put('c', 7);
        //we can not add null key in the TreeMap
        // map.put(null, 3);
        System.out.println(map);
    }
}
// The keys are sorted alphabetically (e.g., {Austria=Wien, England=London,
// India=New Dehli, Norway=Oslo, USA=Washington DC}).
// Duplicates like "Norway" will only appear once.