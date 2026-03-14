public class PrintOnetoN{
    public static void main(String[] args) {
        int num = 5;
        print(num);
    }
    public static void print(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        print(num-1);
        System.out.println(num);
    }
}