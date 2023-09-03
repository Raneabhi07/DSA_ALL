package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {

    public static int maxWaterBruteForce(ArrayList<Integer> list){
        int max = 0;
        for(int i = 0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                int minHt = Math.min(list.get(i), list.get(j));
                int ans = minHt * (j - i);
                max = Math.max(ans, max);
            }
        }
        return max;
    }

    public static int maxWater(ArrayList<Integer> list){
        int lp = 0;
        int rp = list.size()-1;
        int maxWater = 0;
        
        while(lp < rp){
            //calculate water
            int ht = Math.min(list.get(lp), list.get(rp));
            int ans = ht * (rp - lp);
            maxWater = Math.max(maxWater, ans);
            if(list.get(lp) < list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        
        System.out.println("Maximum water a container can hold is: " + maxWaterBruteForce(list) + " units");
        System.out.println("Maximum water a container can hold is: " + maxWater(list) + " units");

    }
}
