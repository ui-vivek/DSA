package day9;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = { 13, 46, 24, 9, 9, 52, 20, 9, 0 };

        for (int i = 0; i < array.length; i++) {

            int j = i;
            int k = i - 1;
            while (k >= 0) {
                if (array[k] > array[j]) {
                    int temp = array[k];
                    array[k] = array[j];
                    array[j] = temp;
                } else {
                    break;
                }
                j--;
                k--;
            }
        }

        for (int x : array) {
            System.out.println(x);
        }

    }

}