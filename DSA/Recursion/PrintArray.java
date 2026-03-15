public class PrintArray{
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,4,5};

        print(arr , n-1);
    }
    public static void print(int[] arr , int n){
        if(n == 0){
            System.out.println(arr[n]);
            return;
        }
        print(arr,n-1);
        System.out.println(arr[n]);

    }
}