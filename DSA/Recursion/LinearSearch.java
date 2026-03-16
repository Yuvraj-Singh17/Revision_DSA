public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int x = 8;
        System.out.println(LS(arr , x , 0));
    }
    public static boolean LS(int[] arr , int X , int idx){
        if(idx == arr.length){
            return false;
        }
        if(arr[idx] == X){
            return true;
        }
        return LS(arr , X , idx+1);
    }
}
