package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Introduction {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add element
        list.add(2); 
        list.add(4); 
        list.add(6);
        list.add(2);
        list.add(34);

        System.out.println(list);

        //get element
        System.out.println(list.get(2));
        System.out.println(list.get(0));

        //set element
        list.set(3, 34);
        list.set(4, 36);

        System.out.println(list);

        //contains element --> it is a boolean function
        System.out.println(list.contains(34));
        System.out.println(list.contains(2));

        //remove element
        list.remove(2);
        System.out.println(list);

        //reverse of an arraylist
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(1);
        list2.add(2);
        System.out.println("Original arraylist is :" + list2);

        System.out.print("Reverse of Arraylist is:" + " ");
        for(int i=list2.size()-1;i>=0;i--){
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();

        //find maximum in a list
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list2.size();i++){
            if(list2.get(i) > max){
                max = list2.get(i);
            }
        }
        System.out.println("maximum in a list is: " + max);

        //swap two numbers
        System.out.println(list2);
        swap(list2, 1, 3);
        System.out.println(list2);

        //sorting using inbuilt method
        System.out.println("Sorted list is: ");
        Collections.sort(list2);
        System.out.println(list2);

    }
}
