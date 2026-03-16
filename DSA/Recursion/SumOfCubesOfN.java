public class SumOfCubesOfN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n == 1) return 1;
        return n*n*n + sum(n-1);
    }
}
