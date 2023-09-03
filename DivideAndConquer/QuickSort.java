public class QuickSort {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int pidx = partition(arr,si,ei);
        quickSSort(arr, si, pidx-1);
        quickSSort(arr, pidx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si;j<ei;j++){
            if(arr[j] < pivot){
                i++;
                ///swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        //swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,5,7,2,5,2,9,4};
        quickSSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
