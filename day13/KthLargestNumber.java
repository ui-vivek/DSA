package day13;

import java.util.ArrayList;

public class KthLargestNumber {
    public static void sortArray(int arr[], int start, int mid, int end) {
        ArrayList<Integer> arList = new ArrayList<>();
        int left = start;
        int right = mid + 1;

        while (left <= mid && right <= end) {

            if (arr[left] < arr[right]) {
                arList.add(arr[left]);
                left++;
            } else {
                arList.add(arr[right]);
                right++;
            }

        }

        while (left <= mid) {
            arList.add(arr[left]);
            left++;
        }

        while (right <= end) {
            arList.add(arr[right]);
            right++;
        }
        for (int i = start; i <= end; i++) {
            arr[i] = arList.get(i - start);
        }
    }

    public static void sortTheArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        sortTheArray(arr, start, mid);
        sortTheArray(arr, mid + 1, end);

        sortArray(arr, start, mid, end);
    }

    public static String kthLargestNumber(String[] nums, int k) {
        int numArry[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numArry[i] = Integer.parseInt(nums[i]);
        }

        sortTheArray(numArry, 0, numArry.length - 1);

        String ans = String.valueOf(numArry[nums.length-k]);
        
        return ans;
    }

    public static void main(String[] args) {
        String arr[] = { "3", "6", "7", "10" };
        int k = 4;
        String ans = kthLargestNumber(arr, k);
        System.out.println(ans);
    }
}
