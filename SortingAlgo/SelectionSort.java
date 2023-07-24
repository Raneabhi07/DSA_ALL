

public static void selsort(int urr[]){
        for (int i=0; i<urr.length;i++){
            int minpos =i;
            for(int j=i+1;j<urr.length;j++){
                if(urr[minpos] > urr[j]){
                    minpos = j;
                }
            }
            //swap
            int temp = urr[minpos];
            urr[minpos] = urr[i];
            urr[i] = temp;
        }
    }
