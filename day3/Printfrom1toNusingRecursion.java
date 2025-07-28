//Recursive code for printing numbers from 1 to n : 
import java.util.Scanner;

public class Printfrom1toNusingRecursion {
  public static void recursion(int x) {
        if (x == 0) {
            return;
        }
        recursion(x - 1);
        System.out.println(x);
        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.close();
        recursion(n);

    }
    
}
