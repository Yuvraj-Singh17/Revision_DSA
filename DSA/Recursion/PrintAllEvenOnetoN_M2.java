public class PrintAllEvenOnetoN_M2 {
    public static void main(String[] args) {
        int n = 11;
        printEven(1,n);
    }

    public static void printEven(int n , int N){
        if(n == N){
            if(n%2 == 0){System.out.println(n);}
            return;
        }
        if(n % 2 == 0){
            System.out.println(n);
        }
        printEven(n+1 , N);
    }
}
