package ArrayList;

import java.util.*;

public class LonelyNumbers {

    public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> nums){
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<nums.size()-1;i++){
            if((nums.get(i-1) + 1 < nums.get(i)) && (nums.get(i) +1 <nums.get(i+1))){
                list.add(nums.get(i));
            }
        }

        if(nums.size() == 1){
            list.add(nums.get(0));
        }

        if(nums.size() > 1){
            if(nums.get(0) + 1 < nums.get(1)){
                list.add(nums.get(0));
            }
            if(nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)){
                list.add(nums.get(nums.size()-1));
            }
        }

        return list;
    }

    //Solution using hashmap TC = O(n) & SC = O(n)
    public static ArrayList<Integer> lonelyNum(ArrayList<Integer> nums){
        ArrayList<Integer> res = new ArrayList<>();

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<nums.size();i++){
            if(hm.containsKey(nums.get(i))){
                hm.put(nums.get(i), hm.get(nums.get(i)) + 1);
            }else{
                hm.put(nums.get(i), 1);
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            if((hm.get(nums.get(i)) == 1) && !hm.containsKey(nums.get(i) + 1) && !hm.containsKey(nums.get(i) - 1)){
                res.add(nums.get(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(8);
        nums.add(6);
        nums.add(5);

        System.out.println(lonelyNum(nums));
        System.out.println(lonelyNumbers(nums));
    }
}
