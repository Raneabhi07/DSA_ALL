package Recursions;

public class Firstoccurence {
    public static int firstOccurence(int[] arr, int key, int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,34,5,6,67,5};
        System.out.println(firstOccurence(arr, 60, 0));
    }
}
