package Recursions;

public class PrintDec {
    public static void PDec(int n){
        if(n == 1){
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        PDec(n-1);
    }

    public static long optimizedPow(int x, int n){
        if(n == 1){
            return x;
        }
        long ans = optimizedPow(x, n/2);
        if(n%2 == 0){
            return ans*ans;
        }else{
            return x*ans*ans;
        }
    }
    public static void main(String[] args) {
        //PDec(n);
        System.out.println(optimizedPow(2, 50));
    }
}
