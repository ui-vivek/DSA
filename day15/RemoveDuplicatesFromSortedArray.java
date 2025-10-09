
import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public static int remDupli(int nums[]){

        int i=0,j=1;
        while(j<nums.length){
            if(nums[i] !=nums[j]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return  i+1;
    }
    public  static int remDup(int nums[]){
        ArrayList<Integer> arl = new ArrayList<>();
        int preEl = Integer.MAX_VALUE;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != preEl){
                arl.add(nums[i]);
                count++;
                preEl= nums[i];
            }
        }
        for(int k= 0;k<arl.size();k++){
            nums[k] = arl.get(k);
        }
        System.out.println(arl);
        return count-1;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2};
        // int ans = remDup(nums);
        // System.out.println(ans);
        int ans2 = remDupli(nums);
        System.out.println(ans2);
    }
}