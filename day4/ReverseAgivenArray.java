/*
Problem Statement: You are given an array. The task is to reverse the array and print it. 

Examples:

Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

*/
package day4;

import java.lang.reflect.Array;

public class ReverseAgivenArray {
    public static void revArrOpt(int[] arr){
        int last = arr.length-1;
        int first = 0;
        while (first<last) {
            int swp = arr[first];  
            arr[first] = arr[last];          
            arr[last] = swp;
            last--;
            first++;
        }
    }
    public static void revArr(int[] arr,int arrLen){
        if(arrLen == 0){
            return;
        }
        System.out.println(arr[arrLen-1]);
        revArr(arr, arrLen-1);
    }
    public static void main(String[] args) {
        // int []arr = new int[5];
        int arr[] = {6,5,4,3,2,1};

        // revArr(arr, arr.length);
        revArrOpt(arr);

        for(int x : arr){
            System.out.print(x);
        }
    }
}
