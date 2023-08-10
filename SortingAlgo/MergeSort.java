public class MergeSort{
                                            
  public static void printArr(int arr){      //function to print an array
    for(int i=0;i<arr.lrngth;i++){
      System.out.print(arr[i] + " ");
    }
  }
  public static void mergeSort(int arr[], int si, int ei){
    if(si>=ei){                             //base case condition
      return;
    }
    int mid = (si+ei)/2;                                        
    mergeSort(arr,si,mid);                  //calling to divide left part of an array
    mergeSort(arr,mid+1,ei);                //calling to divide right part of an array
    merge(arr,si,mid,ei);                   //calling to merge an array
  }

  public static void merge(int arr[], int si, int mid, int ei){        
    int temp[] = new int[ei-si+1];          //creating a temporary array for sorting operation
    int i = si;                             //iterator for left part 
    int j = mid+1;                          //iterator for right part
    int k = 0;                              //iterator for temp array  
    while(i<=mid && j<=ei){                 //while loop to compare the values and store it in temp array
      if(arr[i] < arr[j]){                  
        temp[k] = arr[i];
        i++
      }else{
        temp[k] = arr[j];
        j++;
      }
      k++;
    }
    while(i<=mid){                         //loop for remaining values in the left part
      temp[k++] = arr[i++];
    }
    while(j<=ei){                          //loop for remaining values in right part
      temp[k++] = arr[j++];
    }
    for(k=0, i=si; k<temp.length; k++, i++){ //loop to copt values from temp array to original array 
      arr[i] = temp[k];
    }
  }
  public static void main(String args[]){
    int arr[] = {8,6,7,3,4,6,24,2};
    mergeSort(arr, 0, arr.length-1);
    printArr(arr);
}

