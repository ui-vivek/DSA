package day12;

import java.util.ArrayList;

public class MergeSort {
    public static void sortSmallArrays(int arr[], int st, int mid, int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = st;
        int right = mid + 1;
        while (left <= mid && right <= end) {

            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= end) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = st; i <= end; i++) {
            arr[i] = temp.get(i - st);
        }
    }

    public static void mergeSort(int arr[], int st, int end) {
        if (st >= end) {
            return;
        }
        int mid = (st + end) / 2;
        // half the array
        // first half
        mergeSort(arr, st, mid);
        // second half
        mergeSort(arr, mid + 1, end);
        // then sort the both small arrays
        sortSmallArrays(arr, st, mid, end);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 8, 5, 1, 4, 23 };

        mergeSort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
