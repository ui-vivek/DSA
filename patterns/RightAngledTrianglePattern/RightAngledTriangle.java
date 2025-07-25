package patterns.RightAngledTrianglePattern;

public class RightAngledTriangle {
    public static void main(String[] args) {
        int n = 1;
        while (n<=5) {
            int m = 1;
            while (m<=n) {
                System.out.print("* ");
                m++;
            }
            System.out.println();
            n++;
        }
    }
}
