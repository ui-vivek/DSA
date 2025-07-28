public class FactorialofaNumber {
    public static int fac(int x){
        if(x==1){
            return x;
        }

        return x*fac(x-1);
    }
        public static void main(String[] args) {
        int n = 3;
        System.out.println(fac(n));
    }
}
