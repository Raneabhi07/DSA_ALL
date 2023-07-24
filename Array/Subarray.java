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

    public static void subArraySumI(int num[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE; 

        for (int i = 0;i<num.length;i++){ // first 
            for (int j = 0;j<num.length;j++){  // last
                currsum = 0;
                for (int k = i;k<=j; k++){ // values between first and last
                    currsum += num[k]; // sum
                }
                System.out.println(currsum);  
                if (maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("maxsum is: " + maxsum);
    }


    public static void  kadanesAlgo (int num[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        
        for (int i = 0; i < num.length;i++){
            currsum = currsum + num[i];
            if (currsum > maxsum){  // maxsum = Math.max(maxsum, currsum);
                maxsum = currsum;
            }
            if (currsum < 0) {
                currsum = 0;
            }
        }
        System.out.println("Max subarray sum is :" + maxsum);
    }



    public static void main (String args[]){
        // int num[] = {2,4,6,8,10};
        // subArraySumI(num);
        // subArayPrint(num);
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanesAlgo(num);
    }
    
}
