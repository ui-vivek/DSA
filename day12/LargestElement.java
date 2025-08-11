package day12;

public class LargestElement {
    public static int findLarge(int arr[], int index) {

        if (index >= arr.length - 1) {
            return arr[index];
        }

        int small = arr[index];
        int sm = findLarge(arr, index + 1);

        if (small > sm) {
            return small;
        } else {
            return sm;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 0 };

        int ans = findLarge(arr, 0);
        System.out.println(ans);
    }
}
