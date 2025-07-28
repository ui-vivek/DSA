package day2;

import java.util.*;

public class PrintallDivisors {
    public static ArrayList<Integer> printAllDiv(int x) {

        ArrayList<Integer> arr = new ArrayList<>();
        int n = 1;
        while (n <= x) {
            if (x % n == 0) {
                arr.add(n);
            }
            n++;
        }
        return arr;

    }

    public static void main(String[] args) {

        int n = 36;
        ArrayList<Integer> arr = printAllDiv(n);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

}
