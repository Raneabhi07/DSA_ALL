package Recursions;

public class SumNaturalNum {

    public static int sumNum(int n){
        if(n == 1){
            return 1;
        }
        int ans = n+ sumNum(n-1);
        return ans;
    }
    public static void main(String[] args) {
        int n = 30;
        System.out.println(sumNum(n));

    }
}
