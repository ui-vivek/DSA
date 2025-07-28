//Recursive code for printing numbers from N to 1 : 

import java.util.Scanner;

public class Nto1usingRecursion {

    public static int recursion(int x) {
        if (x == 0) {
            return x;
        }
       
        System.out.println(x);
        return  recursion(x - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.close();
        recursion(n);

    }
}