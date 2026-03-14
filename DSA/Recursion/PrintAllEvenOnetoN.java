public class PrintAllEvenOnetoN {
    public static void main(String[] args) {
        int n = 11;
        printEven(n);
    }
    public static void printEven(int n){
        if(n == 2){
            System.out.println(n);
            return;
        }
        printEven(n-1);
        if(n%2 == 0){
            System.out.println(n);
        }
    }
}
