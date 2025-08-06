package day8;

public class BubbleSortAlgorithm {

    public static void main(String[] args) {
        int arr[] = { 3, 5, 10, 1, 0, 7 };

        for (int i = 0; i < arr.length; i++) {
            int didSwap = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
        }

        for (int n : arr) {
            System.out.println(n);
        }
    }
}
