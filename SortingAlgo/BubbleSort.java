//This code is for bubble sorting technique.
//It has o(n^2) time complexity. 
//And o(1) space complexity.

public static void bubble(int sort[]){
        for(int i=0; i< sort.length-1;i++){
            for (int j=i; j< sort.length-1; j++){
                if(sort[j] > sort[j+1]){
                    int temp = sort[j];
                    sort[j] = sort[j+1];
                    sort[j+1] = temp;
                }
            }
        }
    }
