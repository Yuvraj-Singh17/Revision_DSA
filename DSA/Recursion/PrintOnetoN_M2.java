public class PrintOnetoN_M2 {
    public static void main(String[] args) {
        int n = 5;
        print(1,n);
    }
    public static void print(int num , int n){
        if(num == n){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        print(num+1,n);
    }
}
