public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(sum(arr , 0));
    }
    public static int sum(int[] arr , int n){
        if(n == arr.length){
            return 0;
        }
        return arr[n] + sum(arr , n+1);
    }
}
