public class RotateArrayby1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int last = arr[arr.length-1];
        rotate(arr, arr.length-1);
        arr[0] = last;
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void rotate(int[] arr  , int st){
        if(st == 0){
            return;
        }
        arr[st] = arr[(st-1)];
        rotate(arr , st-1);
    }
}
