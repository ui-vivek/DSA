package day14;

public class SecondSmallestandSecondLargest {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 1, 2, 1, 0, 0, 0, 5, -1 };
        int sSmall = Integer.MAX_VALUE;
        int sLarge = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                sLarge = large;
                large = arr[i];
            } else if (arr[i] > sLarge && arr[i] != large) {
                sLarge = arr[i];
            }

            if (arr[i] < small) {
                sSmall = small;
                small = arr[i];
            } else if (arr[i] < sSmall && arr[i] != small) {
                sSmall = arr[i];
            }
        }
        System.out.println(sLarge + " " + sSmall);
    }
}
