public class MergeSortStrings {

    public static String[] mergeSort(String[] arr, int lo, int hi){
        if(lo == hi){
            String[] A = { arr[lo] };
            return A;
        }
        int mid = (lo+hi)/2;
        String[] arr1 = mergeSort(arr,lo , mid);
        String[] arr2 = mergeSort(arr1, mid+1, hi);

        String[] arr3 = merge(arr1, arr2);
        return arr3;

    } 
    public static String[] merge(String[] arr1, String[] arr2){
        int m = arr1.length, n = arr2.length;
        String[]  arr3 = new String[m+n];

        int idx = 0;
        int i = 0;
        int j = 0;
        
        while(i<m && j<n){
            if(isAlphabeticallySmaller(arr1[i], arr2[j])){
                arr3[idx] = arr1[i];
                i++;
                idx++;
            }else{
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }

        while(i<m){
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }
        while(j<n){
            arr3[idx] = arr2[j];
            idx++;
            j++;
        }

        return arr3;
    }

    public static boolean isAlphabeticallySmaller(String str1, String str2){
        if(str1.compareTo(str2) < 0){
            return true;
        }
        return false;
    }

    public static void printArr(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] a = {"sun", "earth", "mars","mercury"};
        mergeSort(a, 0, a.length-1);
        printArr(a);
    }
}