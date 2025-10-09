package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArays {
    public static int[] intersectionFind(int nums1[], int nums2[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            Integer isContain = map.get(nums1[i]);
            if (isContain != null) {
                map.put(nums1[i], isContain + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            Integer isContain = map.get(nums2[i]);
            if (isContain != null && !list.contains(nums2[i]) ) {
               list.add(nums2[i]);
            } 
        }


         int arrAns [] = new int[list.size()];
         for(int x=0;x<list.size();x++){
            arrAns[x] = list.get(x);
         }
         return arrAns;
    }

    public static void main(String[] args) {
        int arr1[] = { 1,2,2,1 };
        int arr2[] = { 2,2 };

        int arr[] = intersectionFind(arr1,arr2);
        
    }
}
