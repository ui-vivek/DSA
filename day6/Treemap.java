package day6;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String, String> capitalCities = new TreeMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
    }
}
// The keys are sorted alphabetically (e.g., {Austria=Wien, England=London,
// India=New Dehli, Norway=Oslo, USA=Washington DC}).
// Duplicates like "Norway" will only appear once.