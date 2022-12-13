public class Subarray {


    public static void subArayPrint (int num[]){
        for (int i = 0;i<num.length;i++){
            for(int j = i; j<num.length;j++){
                for (int k = i; k<=j;k++){
                    System.out.print(num[k] + " ");  // printing subarrays
                }
                System.out.println(); 
            }
            System.out.println();
        }
    }
}
