public class MergeSortDescending {
    public static void main(String[] args) {
        int[] arr = {2,3,8,4,1,4,6,9,34};
        mergeSort(arr , 0 , arr.length-1);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] arr , int start , int end){
        if(start == end){
            return;
        }

        int mid = start + (end-start)/2;

        mergeSort(arr ,start , mid);
        mergeSort(arr , mid+1 , end);

        merge(arr , start , mid , end);
    }

    public static void merge(int[] arr , int start , int mid , int end){
        int idx = 0;
        int[] temp = new int[end - start + 1];

        int left = start;
        int right = mid+1;

        while(left <= mid && right <= end){
            if(arr[left] >= arr[right]){
                temp[idx++] = arr[left++];
            }else{
                temp[idx++] = arr[right++];
            }
        }

        while(left <= mid){
            temp[idx++] = arr[left++];
        }
        while(right <= end){
            temp[idx++] = arr[right++];
        }

        idx = 0;
        while(start <= end){
            arr[start++] = temp[idx++];
        }
    }
}
