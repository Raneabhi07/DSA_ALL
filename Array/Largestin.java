import java.util.*;

public class Largestin {

    public static int getLargest (int num[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i< num.length;i++){
            if (num[i] > largest){
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int num[] = {2, 4, 6, 8, 88};
        System.out.println("Largest value is :" + getLargest(num));
    }
}
