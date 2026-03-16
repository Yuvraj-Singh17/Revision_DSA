public class PowerOf4 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(power(n));
    }
    public static int power(int n){
        if(n == 0){
            return 1;
        }
        return 4 * power(n-1);
    }
}
