public class PrimeNuber {
    public static void main(String[] args) {
        int n = 33;
        System.out.println(isPrime(n-1 , n));
    }
    public static String isPrime(int n , int num){
        if(n == 1){
            return "Yes it is a Plaindrome number";
        }
        if(num % n == 0) return "No it is not a Palindrome Number";
        return isPrime(n-1 , num);
    }
}
