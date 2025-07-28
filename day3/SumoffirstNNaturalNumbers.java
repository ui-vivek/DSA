public class SumoffirstNNaturalNumbers {
    public static int nSum(int x){

        if(x==0){
            return x;
        }

        return x+nSum(x-1);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(nSum(n));
    }
}
