package day6;

import java.util.*;

public class FindTheHighestlowestFrequencyElement {
    public static void main(String[] args) {
        int[] array = { 10, 5, 10, 15, 10, 5,105 };
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;
        while (i < array.length) {
            Integer count = map.get(array[i]);
            if (count == null) {
                map.put(array[i], 1);
            } else {
                count += 1;
                map.put(array[i], count);
            }
            i++;
        }


        int maxEle = Integer.MIN_VALUE;
        int minEle = Integer.MAX_VALUE;

        for(int k:map.keySet()){
            int value = map.get(k);
          if(value > maxEle ){
            maxEle = k;
          }
          if(value < minEle){
            minEle = k;
          }
        }
        System.out.println(map);
        System.out.println("Max Values is "+ maxEle);
        System.out.println("Min Values is "+ minEle);
    }
}
