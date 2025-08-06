package day11;

import java.util.Scanner;

public class RecursiveBubbleSort {
    public static void recBblSort(int arr[], int n) {
        if (n == 1) {
            return;
        }
        boolean isSwap = false;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                isSwap = true;
            }
        }
        if(!isSwap) return;
        recBblSort(arr, n - 1);
    }

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int arr[] = new int[n];
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;

        // for (int i = 0; i < n; i++) {
        // arr[i] = s.nextInt();
        // }
        recBblSort(arr, n);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}