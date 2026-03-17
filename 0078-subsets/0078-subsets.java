class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        sub(nums , 0 , ans , temp);
        return ans;
    }
    public void sub(int[] arr, int index, List<List<Integer>> ans , List<Integer> temp){
        if(index == arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        // No ke liye nahi lenge
        sub(arr , index + 1 , ans, temp);

        // Yes ke liye le lenge
        temp.add(arr[index]);
        sub(arr , index + 1 , ans , temp);

        //undo changes in temp
        temp.remove(temp.size()-1);
    }
}