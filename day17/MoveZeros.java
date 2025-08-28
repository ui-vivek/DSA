package day17;

public class MoveZeros {
    public static void moveZeros(int nums[]) {
        int i = 0, j = 0;

        while (i < nums.length && j < nums.length) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12 };
        moveZeros(arr);
        for(int x:arr){
            System.out.println(x);
        }
    }
}
