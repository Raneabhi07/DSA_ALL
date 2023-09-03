package ArrayList;
import java.util.*;

public class PairSum {
    public static boolean pairSum1BF(ArrayList<Integer> list, int target){
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                int sum = list.get(i) + list.get(j);
                if(sum == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pairSum1Optimized(ArrayList<Integer> list, int target){
        int lp =0;
        int rp = list.size()-1;

        while(lp < rp){
            if((list.get(lp) + list.get(rp)) == target){
                return true;
            }
            if((list.get(lp) + list.get(rp)) < target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        if(pairSum1Optimized(list, 5)){
            System.out.println("target found");
        }else{
            System.out.println("not found");
        }
    }
    
}
