/*
    Example 1:
    Input:N1 = 9, N2 = 12


    Output:3
    Explanation:Factors of 9: 1, 3 and 9
    Factors of 12: 1, 2, 3, 4, 6, 12
    Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD. 
 */
package day2;

import java.util.*;
import java.util.List;

public class GCD {
    public static List<Integer> gcd(int n1, int n2) {
        ArrayList <Integer> list = new ArrayList<>();
        int min = Math.min(n1, n2);
        while(min>1){
            if(n1%min == 0 && n2%min == 0){
                list.add(min);
            }
            min--;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(gcd(9, 12));
        System.out.println(gcd(20, 15));
    }
}
