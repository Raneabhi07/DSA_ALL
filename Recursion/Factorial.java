package Recursions;

public class Factorial {
    public static int fact(int n){
        int ans =1;
        if(n==0){
            return 1;
        }
        ans = n * fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        int n= 5;
        System.out.println(fact(n));
    }
}
