public class MinINArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(min(arr , 0));
    }
    public static int min(int[] arr , int n){
        if(n == arr.length-1){
            return arr[n];
        }
        return Math.min(arr[n] , min(arr , n+1));
    }
}
