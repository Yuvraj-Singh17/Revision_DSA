
public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {3,4,5};
        int[] ans = new int[1];
        sub(arr , 0 ,0 ,ans);
        System.out.println(ans[0]);
    }
    public static void sub(int[] arr , int index, int sum ,int[] ans){
        if(index == arr.length){
            ans[0] += sum;
            return;
        }

        //No ke liye jab nhi lena hoga 
        sub(arr ,index + 1 , sum , ans);

        // Yes ke liye jab element lena ho toh
        sub(arr , index+1 , sum + arr[index] , ans);
    }
}
