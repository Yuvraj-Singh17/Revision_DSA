public class MaximumNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,8,6,7,777,65,5,4,22233,3,444,5545,4333,222};
        System.out.println(max(arr , 0));
    }
    public static int max(int[] arr , int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        return Math.max(arr[idx],max(arr,idx+1));
    }
}
