public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(BS(arr , 0 , arr.length-1 , 5));
    }

    public static boolean BS(int[] arr , int st , int end , int X){
        if(st > end){
            return false;
        }

        int mid = st + (end-st)/2;
        if(arr[mid] == X){
            return true;
        }else if(arr[mid] < X){
            return BS(arr , mid+1 , end , X);
        }
        return BS(arr , st , mid - 1 , X);
    }
}
