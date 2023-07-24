public static int binSearch (int num[], int key){
        int start = 0;
        int end = num.length-1;
        while (start <= end){
            int mid = (start+end)/2;
            // Compare
            if (num[mid] == key){
                return mid;
            }
            if (num[mid] < key){       // 2nd half
                start = mid+1;       
            }
            else{
                end = mid-1;
            }
        }
        return -1;   
    }
