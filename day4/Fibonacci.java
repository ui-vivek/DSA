package day4;

public class Fibonacci {

    public static void printFebForLoop(int x) {
        int first = 0;
        int last = 1;
        System.out.print(first);
        System.out.print(last);
        x=x-2;
        for (int i = 1; i <= x; i++) {
            int temp = first;
            first = last;
            last = last + temp;
            System.out.print(last);
        }
    }

    public static int printFeb(int x) {
     if(x <= 1){
        return x;
     }
     int fb = printFeb(x-1) + printFeb(x-2);
     return fb;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFeb(n));

        printFebForLoop(n);
    }
}
