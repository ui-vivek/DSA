package day17;

public class LinearSearchInC {
    public static int leanSearch(int nums[],int n,int arrIndex) {
        if(arrIndex >= nums.length){
            return  -1;
        }else if(nums[arrIndex] == n){
            return arrIndex;
        }else{
           return leanSearch(nums, n, arrIndex+1);
        }
    }
    public static void main(String[] args) {
        int arr[]= {1, 2 ,3 ,4 ,5};
        System.out.println(leanSearch(arr,3,0));
    }
}
