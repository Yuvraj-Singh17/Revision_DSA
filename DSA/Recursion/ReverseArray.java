public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3,5,8,4,3,2,1,6,77,23};
        reverse(arr , 0 , arr.length-1);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void reverse(int[] arr , int st , int end){
        if(st >= end){
            return;
        }
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
        reverse(arr , st+1 , end-1);
    }
}
