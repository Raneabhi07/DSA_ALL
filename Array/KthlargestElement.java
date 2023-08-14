//Given an integer array nums and an integer k, return the kth largest element in the array.
//Note that it is the kth largest element in the sorted order, not the kth distinct element

public class KthlargestElement {
    public static int klargest(int[] arr, int k){
        //Approach 1  -->
        //Arrays.sort(arr);
        //return arr[arr.length-k];

        //Approach 2 -->
        if(k > arr.length){
            return -1;
        }
        while(k>0){
            int largest = Integer.MIN_VALUE;
            int pos = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i] > largest){
                    largest = arr[i];
                    pos = i;
                }
            }
            if(k == 1){
                return arr[pos];
            }else{
                arr[pos] = 0;
            }
            k--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        System.out.println(klargest(arr, 6365));
        
    }
}
