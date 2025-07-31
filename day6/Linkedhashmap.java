package day6;

import java.util.*;;

public class Linkedhashmap {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 5, 1, 0, 2, 3, 9 };
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();


        for (int i = 0; i < arr.length; i++) {
            Integer count = map.get(arr[i]);

            if(count!=null){
                count+=1;
                map.put(arr[i], count);
            }else{
                map.put(arr[i], 1);
            }
        }
        // We can add
        map.put(null, 3);
        System.out.println(map);
    }
}
