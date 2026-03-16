public class FindTheNumberofEvenelementInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(count(arr,0));
    }
    public static int count(int[] arr , int idx){
        if(idx == arr.length){
            return 0;
        }
        if(arr[idx] % 2 == 0){
            return 1 + count(arr , idx+1);
        }
        return count(arr,idx+1);
    }
}
