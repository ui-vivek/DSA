package day5;

import java.util.*;

public class CountFrequencyOfEachElementInTheArray {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 10, 15, 10, 5 };

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.isEmpty()){
                map.put(arr[i], 1);
            }else{
                Integer count = map.get(arr[i]);
                if(count != null){
                    count+=1;
                    map.put(arr[i], count);
                }else{
                    map.put(arr[i], 1);
                }
            }
        }
        System.out.println(map);
    }
}
