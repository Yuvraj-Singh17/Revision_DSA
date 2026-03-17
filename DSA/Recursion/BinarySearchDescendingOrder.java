public class BinarySearchDescendingOrder{
    public static void main(String[] args) {
        int[] arr = {10,7,6,2,1};

        System.out.println(BS(arr , 0 , arr.length-1 , 8));
    }
    public static boolean BS(int[] arr , int st , int end , int target){
        if(st >= end){
            return false;
        }
        int mid = st + (end - st)/2;

        if(arr[mid] == target){
            return true;
        }else if(arr[mid] > target){
            return BS(arr , mid + 1 , end , target);
        }
        return BS(arr , st , mid-1 , target);
    }
}