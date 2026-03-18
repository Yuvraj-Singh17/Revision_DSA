public class TargetSumRepetition{
    public static void main(String[] args) {
        int[] arr = {2,3,4};

        System.out.println(subSum(arr , 0 , 6));
    }
    public static int subSum(int[] arr , int idx , int target){
        if(arr.length == idx || target < 0 ){
            return 0;
        }
        if(target == 0) return 1;

        return subSum(arr , idx + 1 , target) + subSum(arr , idx , target - arr[idx]);
    }
}