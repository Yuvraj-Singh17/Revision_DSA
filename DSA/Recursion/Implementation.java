public class Implementation{
    public static void main(String[] args) {
        Fun3(3);
    }

    public static void Fun3(int n){
        if(n == 0){
            System.out.println("Happy Birthday");
            return;
        }
        System.out.println(n + " days left for Birthday");
        Fun3(n-1);
    }
}