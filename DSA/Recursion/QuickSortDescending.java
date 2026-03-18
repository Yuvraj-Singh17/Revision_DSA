public class QuickSortDescending {
    public static void main(String[] args) {
        int[] arr = {4,2,7,5,1,9,8};
        quickSort(arr,0,arr.length-1);
        for(int i : arr) System.out.print(i + " ");
    }

    public static void quickSort(int[] arr , int start , int end){
        if(start >= end){
            return;
        }

        int pivot = partition(arr , start , end);

        quickSort(arr , start , pivot-1);
        quickSort(arr , pivot+1 , end);
    }

    public static int partition(int[] arr , int start , int end){
        int pivot = arr[start];   // FIXED pivot
        int pos = start;

        for(int i = start + 1 ; i <= end ; i++){
            if(arr[i] >= pivot){   // DESCENDING
                pos++;
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[start];
        arr[start] = arr[pos];
        arr[pos] = temp;

        return pos;
    }
}