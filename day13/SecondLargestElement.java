package day13;

public class SecondLargestElement {
    public static int secondLrgEle(int arr[], int n) {
        if (n < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 12, 88, 1, 2, 4, 7, 7, 5, 0, 10, -5 };
        System.out.println(secondLrgEle(arr, arr.length));
    }
}
