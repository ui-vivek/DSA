package day1;

public class ReverseDigitsofANumber {

    public static void main(String[] args) {
        int num2 = 8574;
        int rev2 = 0;
        while (num2 > 0) {
            int rem = num2 % 10;
            rev2 = rev2 * 10 + rem;

            num2 = (num2 - rem) / 10;
        }
        System.out.println(rev2);

    }
}