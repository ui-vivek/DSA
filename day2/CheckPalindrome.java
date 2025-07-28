/*A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed. */
package day2;

public class CheckPalindrome {
    public static int reverse(int x) {
        int rev = 0;
        boolean isNav = false;
        if (x < 0) {
            x *= (-1);
            isNav = true;
        }
        ;
        while (x > 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x -= rem;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8))
                return 0;
        }
        return isNav ? rev *= (-1) : rev;
    }

    public static boolean checkPalindrome(int x) {
        int check = x;
        int rev = 0;
        while (x > 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x -= rem;
            x /= 10;
        }
        return rev == check;
    }

    public static void main(String[] args) {
        // int num1= 121;
        // int num2= 123;
        // int num3= -1253;
        // System.out.println(checkPalindrome(num1));
        // System.out.println(checkPalindrome(num2));

        System.out.println(reverse(1534236469));
        // System.out.println(reverse(num3));
    }
}