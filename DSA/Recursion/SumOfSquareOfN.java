public class SumOfSquareOfN {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(sqSum(n));
    }
    public static int sqSum(int n){
        if(n == 0){
            return 0;
        }
        return n*n + sqSum(n-1);
    }
}
