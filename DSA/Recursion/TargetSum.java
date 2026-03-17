public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(target(arr , 0 , 10));
    }
    public static boolean target(int[] arr , int index , int target){
        if(target == 0){
            return true;
        }
        if(index == arr.length || target < 0){
            return false;
        }

        return (target(arr , index + 1 , target) || target(arr , index + 1 , target - arr[index]));
    }
}
