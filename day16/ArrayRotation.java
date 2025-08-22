package day16;

import java.util.ArrayList;

public class ArrayRotation {
    public static void arrayRotate(int nums[],int k){
        if(nums.length <=1){
            return;
        }
        if(k>nums.length){
            k= k%nums.length;
            System.out.println(k);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=nums.length-k;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length-k;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        int k=4;
        arrayRotate(nums,k);
    }
}
