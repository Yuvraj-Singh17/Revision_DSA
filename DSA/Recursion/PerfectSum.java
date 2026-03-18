public class PerfectSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8};
        int target = 10;
        int[] ans = new int[1];
        ps(arr , target , 0 , ans);
        System.out.println(ans[0]);
    }
    public static void ps(int[] arr , int target , int idx , int[] ans){
        
         if(idx == arr.length || target < 0){
            if(target == 0){
                ans[0]++;
            }
            return;
        }
        ps(arr , target , idx+1 , ans);
        ps(arr , target - arr[idx] , idx+1 , ans);
    }
}
