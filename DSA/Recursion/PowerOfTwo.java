public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 5;
        if(n == 0){
            System.out.println(1);
        }else{
            System.out.println(power(n));
        }
    }
    public static int power(int n){
        if(n == 1){
            return 2;
        }
        return 2 * power(n-1);
    }
}
