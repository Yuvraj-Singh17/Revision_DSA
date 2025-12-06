import java.util.*;

class MaximizePointsAfterChoosingKTasks{
    public long maxPoints(int[] technique1, int[] technique2, int k) {
        int n = technique1.length;
        long total = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0 ;  i< n ; i++){
            total += technique2[i];
            arr.add(technique1[i] - technique2[i]);
        }
        Collections.sort(arr , Collections.reverseOrder());
        for(int i = 0 ; i < k ; i++){
            total += arr.get(i);
        }
        for(int i = k ; i < n ; i++){
            if(arr.get(i) > 0){
                total += arr.get(i);
            }
        }
        return total;
    }
}