/*
Problem Statement: "Given a string, check if the string is palindrome or not."  A string is said to be palindrome if the reverse of the string is the same as the string.

Examples:

Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

*/
package day4;

public class IsPalindrome {

    public static boolean isPalindrome(String str, int strLen) {
        if (strLen == 0) {
            return true;
        }
        if (str.charAt(strLen - 1) != str.charAt(str.length() - strLen)) {
            return false;
        }

        return isPalindrome(str, strLen - 1);
    }

    public static void main(String[] args) {
        String str = "TAKE U FORWARD";
        System.out.println(isPalindrome(str, str.length()));
    }
}
