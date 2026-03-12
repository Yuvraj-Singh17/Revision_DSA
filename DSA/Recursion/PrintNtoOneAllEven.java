public class PrintNtoOneAllEven {
    public static void main(String[] args) {
        print(8);
    }
    public static void print(int n){
        if(n == 2){
            System.out.println(2);
            return;
        }
        System.out.println(n);
        print(n-2);
    }
}
