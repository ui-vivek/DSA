package day2;

public class CheckArmstrong {

    public static boolean isArm(int x) {

        int pow = String.valueOf(x).length();
        int arm = 0;
        int check = x;
        while (x > 0) {
            int rem = x % 10;
            arm = (int)(arm + Math.pow(rem, pow));
            x = (x - rem) / 10;
        }
        return check == (int)arm;
    }

    public static void main(String[] args) {
        System.out.println(isArm(372));
        System.out.println(isArm(371));
    }
}
