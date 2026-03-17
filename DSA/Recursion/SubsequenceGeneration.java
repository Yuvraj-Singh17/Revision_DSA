import java.util.*;
public class SubsequenceGeneration {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        sub(arr , 0 , ans , temp);

        System.out.println(ans);
    }
    public static void sub(int[] arr , int index , ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp){
        if(index == arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //No (jab hum element nhi lenge)
        sub(arr , index+1 , ans , temp);

        //Yes(Jab hum element le lenge)
        temp.add(arr[index]);
        sub(arr , index+1 , ans , temp);

        //Backtracking
        temp.remove(temp.size() - 1);
    }
}
