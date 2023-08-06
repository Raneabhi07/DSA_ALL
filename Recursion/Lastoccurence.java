package Recursions;

public class Lastoccurence {
    public static int lastOccurence(int[] arr,int key, int i){
        if (i == arr.length-1){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {0,2,3,4,2,1};
        System.out.println(lastOccurence(arr, 2, 0));
    }
}
