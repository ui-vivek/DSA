package switchcase;

public class Switch {
    public static void sCase(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                // break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Hello JAVA");
                break;
        }
        return;
    }

    public static void main(String[] args) {
        int n = 2;
        sCase(n);
    }
}
