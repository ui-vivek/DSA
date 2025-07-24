package patterns.NForest;

import java.util.Scanner;

public class NForest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();;
    }
}
