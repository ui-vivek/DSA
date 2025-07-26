package day1;
import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        s.close();
        int num2 = num1;

        // 1st
        int count=0;
        while (num1>0) {
            count++;
            int rem = num1%10;
            num1-=rem;
            num1/=10;
        }
        System.out.println(count);

        // 2nd
        String str = String.valueOf(num2);
        System.out.println(str.length());
    }

}