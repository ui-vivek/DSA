public class IsPrime {
    public static boolean checkPrime(int x) {
        int count = 0;
        for(int i = 1;i*i<=x;i++){
            if(x%i ==0){
                count++;

                if(x/i != i){
                    count++;
                }
            }
            if(count>2){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 37;
        System.out.println(checkPrime(num));
    }
}
