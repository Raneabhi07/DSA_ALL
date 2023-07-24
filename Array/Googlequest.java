public class Googlequest {
    public static void sum8(int arr[],int sum){
        int currsum=0;
        
        for(int i=0;i<arr.length;i++){
            currsum += arr[i];
            if(currsum == sum){
                System.out.print("sum is at:" + i);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,4};
        int nums[] = {1,2,3,9};
        sum8(arr, 8);
    }
}
