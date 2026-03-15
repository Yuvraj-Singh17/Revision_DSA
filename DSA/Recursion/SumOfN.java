public class SumOfN {
    public static void main(String[] args) {
        int n = 6;
        if(n == 0){
            System.out.println(0);
        }else{
            System.out.println(sum(n));
        }
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
}
