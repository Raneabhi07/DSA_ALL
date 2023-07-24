public class SecondMin {
    public static void main(String[] args) {
        int arr[] = {3,14,6,7,8};
        int lowest = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]<lowest){
                lowest = arr[i];
            }
        }
        int secondLowest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lowest && arr[i]<secondLowest){
                secondLowest = arr[i];
            }
        }
        System.out.println(secondLowest);
    }
}
