public class PracticeQue1 {
    public static void printKeyPos(int[] arr, int key, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        printKeyPos(arr, key, i+1);
    }
    public static void main(String[] args) {

        //For a given integer array of size N. You have to find all the occurrences(indices) of a given element(Key)
        //and print them. Use a recursive function to solve this problem.
        int[] arr = {3,2,4,5,6,2,7,2,2};
        printKeyPos(arr, 2, 0);
        
    }
}
