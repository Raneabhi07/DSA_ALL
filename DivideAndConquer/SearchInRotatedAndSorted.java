public class SearchInRotatedAndSorted {
    
    public static int search(int arr[], int target, int si, int ei){
        //base case
        if(si > ei){
            return -1;
        }

        int mid = (si+ei)/2;

        //checking mid
        if(arr[mid] == target){
            return mid;
        }
        //checkinh in L1
        if(arr[si] <= arr[mid]){
            if(arr[si] <= target &&  target <= arr[mid]){
                return search(arr, target, si, mid-1);
            }else{
                return search(arr, target, mid+1, ei);
            }
        }

        //mid on L2
        else{
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,1,2,3};
        System.out.println(search(arr, 2, 0, arr.length-1));
    }
}
