package day7;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = { 0, 0, 0, 13, 46, 24, 52, 20, 9, 9, 9, 1 };

        for (int i = 0; i < array.length; i++) {

            int smallIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallIndex]) {
                    smallIndex = j;
                }
            }

            int small = array[smallIndex];
            array[smallIndex] = array[i];
            array[i] = small;

        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
